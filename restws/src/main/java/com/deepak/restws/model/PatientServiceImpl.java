package com.deepak.restws.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
	
	Map<Long,Patient> patients=new HashMap<>();
	long currentId=123;

	public PatientServiceImpl() {
		init();
	}

	 void init() {

		 Patient p1=new Patient();
		 p1.setId(currentId);
		 p1.setName("John");
		 patients.put(p1.getId(), p1);
	}

	@Override
	public List<Patient> getPatients() {

		Set<Entry<Long, Patient>> entrySet = patients.entrySet();
		List<Patient> pts=new ArrayList<>();
		for(Map.Entry m:entrySet)
		{
			pts.add((Patient) m.getValue());
		}
		return pts;
	}

	@Override
	public Patient getPatient(long id) {
		
		if(patients.get(id)==null)
		{
			//throw new WebApplicationException(Response.Status.NOT_FOUND);
			throw new NotFoundException();
		}
		
		return patients.get(id);
		
	}

	@Override
	public Response createPatient(Patient p) {

		p.setId(++currentId);
		patients.put(p.getId(), p);
		return Response.ok(p).build();
	}

	@Override
	public Response updatePatient(Patient p) {
		if(patients.get(p.getId())!=null)
		{
			patients.put(p.getId(), p);
			return Response.ok(p).build();
		}
		//return Response.notModified().build();
		else throw new PatientBusinessException();
	}

	@Override
	public Response deletePatient(long id) {

		if(patients.get(id)!=null)
		{
			patients.remove(id);
			return Response.ok().build();
		}
		return Response.notModified().build();
	}
	
	
	

}
