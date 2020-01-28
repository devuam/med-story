package mx.christez.medstory.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.christez.medstory.configuration.PatientConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.Patient;
import mx.christez.medstory.service.AppUserService;
import mx.christez.medstory.service.PatientService;

@RestController
public class PatientsRestController {
	@Autowired
	private AppUserService appUserService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patients/search")
	public String search(Principal principal) {
		List<Patient> patients = new ArrayList<Patient>();
		List<PatientConfiguration> patientsToMap = new ArrayList<PatientConfiguration>();
		
		AppUser appUser = appUserService.findByEmail(principal.getName());
		patients = patientService.findAllByAppUser(appUser);
		
		for(Patient patient : patients)
			patientsToMap.add(new PatientConfiguration(patient.getBirthday(), patient.getFatherName(), patient.getId(), patient.getMotherName(), patient.getName()));
		
		try {
			String patientsJson = objectMapper.writeValueAsString(patientsToMap);
			return patientsJson;
		}catch(JsonProcessingException jpe) {
			return "[]";
		}
	}
}