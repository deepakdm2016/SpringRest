package com.deepak.oauth.controller;

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
	public void addPassenger(String fn, String ln, String agent) {
		
		Passenger p=new Passenger();
		p.setName(fn+ln);
		p.setId(currentId++);
		passengers.add(p);
		System.out.println(fn+" "+ln);
		System.out.println("Agent"+"::"+agent);

			}


}
