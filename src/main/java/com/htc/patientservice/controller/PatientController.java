package com.htc.patientservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.patientservice.entity.Patient;
import com.htc.patientservice.persistence.IPatient;



@RestController
@RequestMapping("/api")
public class PatientController {
	
	private IPatient repo;
 
@GetMapping("/patients/{appointmentId}")
Patient getPatient(@PathVariable Long appointmentId)
{
	Patient pat=null;
	pat=repo.findById(appointmentId).get();
	return pat;
	
}



@PostMapping("/patients")
Patient createPatient(@RequestBody Patient pat)
{
	return repo.save(pat);
	
}

@GetMapping("/patients")
Patient  findAll() {

  return (Patient) repo.findAll();
}

@DeleteMapping("/patients/{appointmentId}")
void deletePatient(@PathVariable Long appointmentId)
{
	 repo.deleteById(appointmentId);
	
}


@Autowired
public void setRepo(IPatient repo) {
	this.repo = repo;
}
	
	
}