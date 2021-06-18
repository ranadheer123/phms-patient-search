package com.java.phms.patient.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.java.phms.patient.search.model.PatientInfo;
import com.java.phms.patient.search.service.PatientInfoService;

import reactor.core.publisher.Flux;

@RestController
public class PatientInfoController {
	
	@Autowired
	private PatientInfoService patientInfoService;
	
	public Flux<PatientInfo> getAllPatientInformation(){
		System.out.println("request received...");
		return patientInfoService.findAllPatientDetails();
	}

}
