package com.java.phms.patient.search.service;

import com.java.phms.patient.search.model.PatientInfo;

import reactor.core.publisher.Flux;

public interface PatientInfoService {
	
	Flux<PatientInfo> findAllPatientDetails();

}
