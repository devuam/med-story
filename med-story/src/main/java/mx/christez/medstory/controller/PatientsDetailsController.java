package mx.christez.medstory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.christez.medstory.entity.Patient;
import mx.christez.medstory.service.PatientService;

@Controller
public class PatientsDetailsController {
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/patients-details")
	public String index(Model model, @RequestParam int id) {
		Patient patient = patientService.findOne(id);
		model.addAttribute("patientName", patient.getName() + " " + patient.getFatherName() + " " + patient.getMotherName());
		
		return "patients-details";
	}
}