package com.deepak.restws;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
public class CheckProcessingClient {
	
	public static void main(String v[]) 
	{
		
		Client c = ClientBuilder.newClient();
		WebTarget target = c.target("http://localhost:8080/restwsasync/services/checkprocessingservice/checks");
		AsyncInvoker async = target.request().async();
		Object entity=new ChecksList();
		Future<Boolean> response = async.post(Entity.entity(entity, MediaType.APPLICATION_XML), Boolean.class);
		try {
			System.out.println(response.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}
