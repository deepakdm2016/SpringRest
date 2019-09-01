package com.deepak.passengerService;

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

@Path("/passengerService")
@Produces("application/xml,application/json")
@Consumes("application/xml,application/x-www-form-urlencoded,application/json")

public interface PassengerService {
	
	@Path("/passengers")
	@GET
	List<Passenger> getPassengers(@QueryParam("start") int start,@QueryParam("size")int size);
	
	@Path("/passengers")
	@POST
	void addPassenger(@FormParam("fn")String fn, @FormParam("ln")String ln, 
			@HeaderParam("agent") String agent,@Context HttpHeaders headers);
	

}