package com.deepak.restws.model;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/patientService")
@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")

public interface PatientService {

	
	@Path("/patients")
	@GET
	public List<Patient> getPatients();
	
	@Path("/patients/{id}")
	@GET
	public Patient getPatient(@PathParam("id") long id);
	
	@Path("/patients")
	@POST
	Response createPatient(Patient p);
	
	@Path("/patients")
	@PUT
	Response updatePatient(Patient p);
	
	
	@Path("/patients/{id}")
	@DELETE
	Response deletePatient(@PathParam("id") long id);
	
}
