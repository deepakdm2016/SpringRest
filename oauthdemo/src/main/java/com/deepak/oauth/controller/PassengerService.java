package com.deepak.oauth.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Path("/passengerService")
@Produces("application/xml,application/json")
@Consumes("application/xml,application/x-www-form-urlencoded,application/json")
@RestController

public interface PassengerService {
	
	@RequestMapping("/passengers/{name}")
	@GET
	List<Passenger> getPassengers(@QueryParam("start") int start,@QueryParam("size")int size);
	
	@RequestMapping("/passengers")
	@POST
	void addPassenger(@FormParam("fn")String fn, @FormParam("ln")String ln, 
			@HeaderParam("agent") String agent,@Context HttpHeaders headers);
	

}
