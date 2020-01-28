package mx.christez.medstory.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.Patient;
import mx.christez.medstory.repository.PatientRepository;

@Transactional
@Service
public class PatientService {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient findByNameAndFatherNameAndMotherName(String name, String fatherName, String motherName) {
		return patientRepository.findByNameAndFatherNameAndMotherName(name, fatherName, motherName);
	}
	
	public void save(Patient patient, AppUser appUser) {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Setting app user for patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "] with birthday [" + patient.getBirthday() + "]");
		
		patient.setAppUser(appUser);
		
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Calling JPA repository patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "]");
		
		patientRepository.save(patient);
	}

	public List<Patient> findAllByAppUser(AppUser appUser) {
		return patientRepository.findByAppUser(appUser);
	}

	public Patient findOne(Integer id) {
		return patientRepository.findOne(id);
	}

	@PreAuthorize("#email == authentication.name or hasRole('ROLE_ADMIN')")
	public void delete(Patient patient, String email) {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Calling JPA repository for patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "]");
		
		patientRepository.delete(patient);
	}
}
