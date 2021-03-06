package com.deepak.restws.model;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class PatientBusinessExceptionMapper implements ExceptionMapper<PatientBusinessException> {

	@Override
	public Response toResponse(PatientBusinessException e) {
		
		StringBuilder sb=new StringBuilder();
		sb.append("{");
		sb.append("\"status\":\"Invalid patient id is provided in the request\",");

		sb.append("\"message\":\" try with valid patient id\"");

		sb.append("}");
		
		
		return Response.serverError().entity(sb.toString()).status(404).type(MediaType.APPLICATION_JSON).build();
	}

}
