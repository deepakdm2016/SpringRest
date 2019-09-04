package com.deepak.restws;

import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import org.springframework.stereotype.Service;

@Service

public class CheckProcessingImpl {
	
	public void processChecks(@Suspended AsyncResponse response,ChecksList cks)
	{	//logic
		new Thread() {
			public void run() {
				
				response.resume(true);

			}
		}.start();
	}

}
