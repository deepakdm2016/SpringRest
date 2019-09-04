package com.deepak.restws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

@Path("/checkprocessingservice")
public interface CheckProcessor {

	@Path("/checks")
	@POST
	public void processChecks(@Suspended AsyncResponse response,ChecksList cks);
	
}
