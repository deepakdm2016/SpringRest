package com.deepak.oauth.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminController implements PassengerService{
	
	List<Passenger> passengers=new ArrayList<>();
	int currentId=123;

	
/*	@RequestMapping("/admin/{name}")
	public String home(@PathVariable("name")String name)
	{
		return "Hello "+ name;
		
	}*/

	@Override

	@RequestMapping("/admin/passengers")

	public List<Passenger> getPassengers(int start, int size) {
		System.out.println("Start: "+start);
		System.out.println("Size: "+size);

		return passengers;

	}

	@Override
	@RequestMapping("/admin/AddPassengers")

	public void addPassenger(String fn, String ln, String agent) {

		Passenger p=new Passenger();
		p.setName(fn+ln);
		p.setId(currentId++);
		passengers.add(p);
		System.out.println(fn+" "+ln);
		System.out.println("Agent"+"::"+agent);

		}


}
