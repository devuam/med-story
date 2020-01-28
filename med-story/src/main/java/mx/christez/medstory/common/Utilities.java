package mx.christez.medstory.common;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.service.AppUserService;

public class Utilities {
	@Autowired
	private AppUserService appUserService;
	
	public String getUserName(HttpSession session, Principal principal) {
		String name = "";
		
		try{
			name = session.getAttribute("medStoryName").toString();
		}catch(NullPointerException npe){
			AppUser appUser = appUserService.findByEmail(principal.getName());
			name = appUser.getName();
		}
		
		return name;
	}
}
