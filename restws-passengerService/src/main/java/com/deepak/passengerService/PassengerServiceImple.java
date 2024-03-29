package com.deepak.passengerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImple implements PassengerService {

	List<Passenger> passengers=new ArrayList<>();
	int currentId=123;

	@Override
	public List<Passenger> getPassengers(int start, int size) {
		System.out.println("Start: "+start);
		System.out.println("Size: "+size);

		return passengers;
	}

	@Override
	public void addPassenger(String fn, String ln, String agent, HttpHeaders headers) {
		
		Passenger p=new Passenger();
		p.setName(fn+ln);
		p.setId(currentId++);
		passengers.add(p);
		System.out.println(fn+" "+ln);
		System.out.println("Agent"+"::"+agent);

		MultivaluedMap<String, String> rh = headers.getRequestHeaders();
		for(Map.Entry m:rh.entrySet())
		{
			System.out.println("Key: "+m.getKey());
			System.out.println("Value: "+m.getValue());

		}
		
		
		  Map<String, Cookie> cookies = headers.getCookies();
		for(Map.Entry m:cookies.entrySet())
		{
			System.out.println("Cookie Key: "+m.getKey());
			System.out.println("cookie Value: "+m.getValue());

		}

	}


}
