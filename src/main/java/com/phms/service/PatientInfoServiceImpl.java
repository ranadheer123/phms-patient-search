package com.phms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phms.model.PatientInfo;
import com.phms.repo.PatientInfoRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PatientInfoServiceImpl implements PatientInfoService{
	
	@Autowired
	private PatientInfoRepo patientInfoRepo;
	
	@Override
	public Flux<PatientInfo> getPatientDetailsByName(PatientInfo patient){
		return patientInfoRepo.findByFirstNameAndLastName(patient.getFirstName(), patient.getLastName());
	}

	@Override
	public Mono<PatientInfo> getPatientDetailsByNameAndDob(PatientInfo patient) {
		return patientInfoRepo.findByFirstNameAndLastNameAndDateOfBirth(patient.getFirstName(), patient.getLastName(), patient.getDateOfBirth());
	}
	
}
