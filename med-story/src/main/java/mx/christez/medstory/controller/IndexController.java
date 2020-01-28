package mx.christez.medstory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.christez.medstory.entity.AppUser;

@Controller
public class IndexController {
	@ModelAttribute("user")
	public AppUser constructUser() {
		return new AppUser();
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}
}