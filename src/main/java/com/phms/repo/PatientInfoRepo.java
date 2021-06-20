package com.phms.repo;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.phms.model.PatientInfo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PatientInfoRepo extends ReactiveMongoRepository<PatientInfo, String> {
	
	Flux<PatientInfo> findByFirstNameAndLastName(String firstname, String lastname);
	
	Mono<PatientInfo> findByFirstNameAndLastNameAndDateOfBirth(String firstname, String lastname, LocalDateTime dateofbirth);

}
