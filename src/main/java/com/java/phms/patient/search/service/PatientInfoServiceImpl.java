package com.java.phms.patient.search.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.phms.patient.search.dao.PatientInfoRepo;
import com.java.phms.patient.search.model.PatientInfo;

import reactor.core.publisher.Flux;

public class PatientInfoServiceImpl implements PatientInfoService{
	
	@Autowired
	private PatientInfoRepo patientInfoRepo;

	@Override
	public Flux<PatientInfo> findAllPatientDetails() {
		return patientInfoRepo.findAll();
	}

}
