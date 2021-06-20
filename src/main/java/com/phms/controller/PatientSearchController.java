package com.phms.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phms.model.PatientInfo;
import com.phms.service.PatientInfoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/phms")
public class PatientSearchController {
	
	@Autowired
	private PatientInfoService patientInfoService;
		
	@GetMapping("/patient/search")
	public Mono<PatientInfo> getPatientInformation(){
		System.out.println("request recieved to get single patient information...");
		PatientInfo dummy = new PatientInfo();
		dummy.setFirstName("gagan");
		dummy.setLastName("deka");
		//dummy.setDateofbirth(LocalDateTime.parse("2021-02-01T00:00:00Z", DateTimeFormatter.ISO_DATE_TIME));
		dummy.setDateOfBirth(LocalDateTime.parse("2021-02-03T05:30:00", DateTimeFormatter.ISO_DATE_TIME));
		
		return patientInfoService.getPatientDetailsByNameAndDob(dummy);
	}
	
	@GetMapping("/patient/search/name")
	public Flux<PatientInfo> getMatchingPatientInformation(){
		System.out.println("request recieved to get single patient information...");
		PatientInfo dummy = new PatientInfo();
		dummy.setFirstName("gagan");
		dummy.setLastName("deka");
		
		return patientInfoService.getPatientDetailsByName(dummy);
	}	

}
