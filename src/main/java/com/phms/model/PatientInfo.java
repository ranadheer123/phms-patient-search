package com.phms.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection="phmspatientdetails")
public class PatientInfo {
	
	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String provincialPatientId;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime dateOfBirth;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProvincialPatientId() {
		return provincialPatientId;
	}

	public void setProvincialPatientId(String provincialPatientId) {
		this.provincialPatientId = provincialPatientId;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
