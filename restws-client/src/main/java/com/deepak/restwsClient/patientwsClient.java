package com.deepak.restwsClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class patientwsClient {

	public static void main(String[] args) {

		Client c = ClientBuilder.newClient();
		String baseurl="http://localhost:8080/restws/services/patientService";
		WebTarget target = c.target(baseurl).path("/patients").path("/{id}").resolveTemplate("id", 127);
		
		Builder request = target.request();
		Response response = request.get();
		System.out.println(response.getStatus());
		System.out.println("Complete response from server :"+response.readEntity(String.class));
		
		Patient patient = request.get(Patient.class);
		System.out.println(patient.getId()+":"+patient.getName());
		

	}

}
