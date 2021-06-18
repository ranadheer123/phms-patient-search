package com.java.phms.patient.search.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.java.phms.patient.search.model.PatientInfo;

@Repository
public interface PatientInfoRepo extends ReactiveMongoRepository<PatientInfo, String> {

}
