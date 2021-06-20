package com.phms.service;

import com.phms.model.PatientInfo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PatientInfoService {
		
	Flux<PatientInfo> getPatientDetailsByName(PatientInfo patient);
	
	Mono<PatientInfo> getPatientDetailsByNameAndDob(PatientInfo patient);

}
