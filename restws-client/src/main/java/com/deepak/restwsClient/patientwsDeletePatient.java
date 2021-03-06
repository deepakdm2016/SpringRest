package com.deepak.restwsClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class patientwsDeletePatient {

	public static void main(String[] args) {

		Client c = ClientBuilder.newClient();
		String baseurl="http://localhost:8080/restws/services/patientService";
		
		WebTarget target = c.target(baseurl).path("/patients").path("/{id}").resolveTemplate("id", 129);

		System.out.println("Get Patient 129"+target.request().get().readEntity(String.class));

		Builder request = target.request();
		Response response = request.delete();
		System.out.println("Status of Delete: "+response.getStatus());
		//System.out.println("Complete response from server :"+response.readEntity(String.class));
		
		//System.out.println(response.readEntity(String.class));
		//System.out.println("Get Patient 127"+target.request().get().getEntity());

	}

}
