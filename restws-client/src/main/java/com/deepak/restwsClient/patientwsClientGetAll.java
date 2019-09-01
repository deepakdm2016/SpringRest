package com.deepak.restwsClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class patientwsClientGetAll {

	public static void main(String[] args) {

		Client c = ClientBuilder.newClient();
		WebTarget target = c.target("http://localhost:8080/restws/services/patientService/patients");
		Builder request = target.request();
		request.header("Accept", "application/json");
		Response response = request.get();
		System.out.println(response.readEntity(String.class));
		String jsString = response.readEntity(String.class);
		System.out.println(response.getEntity());
		response.close();
		c.close();
		
	}

}
