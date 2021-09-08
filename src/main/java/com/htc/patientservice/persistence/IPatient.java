package com.htc.patientservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.patientservice.entity.Patient;

@Repository
public interface IPatient extends JpaRepository<Patient,Long>{
	
}