package mx.christez.medstory.controller;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.christez.medstory.common.Utilities;
import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.Patient;
import mx.christez.medstory.service.AppUserService;
import mx.christez.medstory.service.PatientService;

@Controller
public class PatientsController {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private AppUserService appUserService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private Utilities utilities;
	
	@RequestMapping("/patients")
	public String index(Model model, HttpSession session, Principal principal) {
		String name = utilities.getUserName(session, principal);
		
		session.setAttribute("medStoryName", name);
		model.addAttribute("medStoryName", name);
		
		return "patients";
	}
	
	@RequestMapping(value = "/patients", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String doRegister(@RequestBody Patient patient, Principal principal) {
		loggerConfiguration.logInfoMessage("Attempt to register patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "]");
		
		loggerConfiguration.logInfoMessage("Capitalizing patient's data and setting birthday");
		
		long birthdayInMillis = patient.getBirthday().getTime();
		patient.setBirthday(new Date(birthdayInMillis + 21600000));
		patient.setFatherName(patient.getFatherName().substring(0, 1).toUpperCase() + patient.getFatherName().substring(1).toLowerCase());
		patient.setMotherName(patient.getMotherName().substring(0, 1).toUpperCase() + patient.getMotherName().substring(1).toLowerCase());
		patient.setName(capitalizePatientName(patient.getName()));
		
		if(patientService.findByNameAndFatherNameAndMotherName(patient.getName(), patient.getFatherName(), patient.getMotherName()) == null) {
			loggerConfiguration.logInfoMessage("Getting app user's data from principal information");
			
			AppUser appUser = appUserService.findByEmail(principal.getName());
			
			loggerConfiguration.logInfoMessage("Saving patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "]");
			
			patientService.save(patient, appUser);
			
			loggerConfiguration.logInfoMessage("Patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "] successfully saved");
			
			return "0";
		}else {
			loggerConfiguration.logInfoMessage("Patient [" + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + "] already exists in database");
					
			return "El paciente " + patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName() + " ya está registrado. Intenta con otro";
		}
	}
	
	private String capitalizePatientName(String name) {
		if(name.contains(" ")) {
			String [] names = name.split(" ");
			String capitalizedName = "";
			
			for(String tmp : names)
				capitalizedName += tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase() + " ";
			
			return (capitalizedName.equals("")) ? capitalizedName : capitalizedName.substring(0, capitalizedName.length() - 1);
		}else
			return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		
	}
	@RequestMapping(value = "/patients/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String delete(@RequestBody Patient patient, Principal principal) {
		loggerConfiguration.logInfoMessage("Attempt to delete patient with id [" + patient.getId() + "]");
		
		Patient realPatient = patientService.findOne(patient.getId());
		patientService.delete(realPatient, principal.getName());
		
		loggerConfiguration.logInfoMessage("Patient with id [" + patient.getId() + "] was successfully deleted");
		
		return "0";
	}
}