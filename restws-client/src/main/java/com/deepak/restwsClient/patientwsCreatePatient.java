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


public class patientwsCreatePatient {

	public static void main(String[] args) {

		Client c = ClientBuilder.newClient();
		String baseurl="http://localhost:8080/restws/services/patientService";
		WebTarget target = c.target(baseurl).path("/patients").path("/{id}").resolveTemplate("id", 127);
		
		Builder request = target.request();
		Response response = request.get();
		System.out.println(response.getStatus());
		System.out.println("Complete response from server :"+response.readEntity(String.class));
		
		Patient patient = request.get(Patient.class);
		patient.setName("Pavithra T M");
		System.out.println(patient.getId()+":"+patient.getName());
	
		WebTarget PUTtarget = c.target(baseurl).path("/patients");
		Response updateResponse = PUTtarget.request().header("Accept", "application/json").put(Entity.entity(patient, MediaType.APPLICATION_XML));
		System.out.println(updateResponse.getStatus());
		System.out.println("Updated response from server :"+request.get().readEntity(String.class));
		
		Patient p1=new Patient();
		p1.setName("Vanitha");
		WebTarget POSTtarget = c.target(baseurl).path("/patients");
		Patient post = POSTtarget.request().post(Entity.entity(p1, MediaType.APPLICATION_XML), Patient.class);
		System.out.println(post.getId()+":"+post.getName());
		System.out.println("Updated response from server :"+request.get().readEntity(String.class));
		
		response.close();
		updateResponse.close();
		c.close();
		
	}

}
