package mx.christez.medstory.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.christez.medstory.common.Utilities;

@Controller
public class DashboardController {
	@Autowired
	private Utilities utilities;
	
	@RequestMapping("/dashboard")
	public String index(Model model, HttpSession session, Principal principal) {
		String name = utilities.getUserName(session, principal);
		session.setAttribute("med-story-name", name);
		model.addAttribute("med-story-name", name);
		
		return "dashboard";
	}
}