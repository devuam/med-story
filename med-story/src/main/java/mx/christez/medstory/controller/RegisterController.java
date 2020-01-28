package mx.christez.medstory.controller;

import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.christez.medstory.configuration.Constants;
import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.service.AppUserService;
import mx.christez.medstory.service.NotificationService;

@Controller
public class RegisterController {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private AppUserService appUserService;
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String doRegister(@RequestBody AppUser user) {
		loggerConfiguration.logInfoMessage("Attempt to register email [" + user.getEmail() + "]");
		
		if(appUserService.findByEmail(user.getEmail()) == null) {
			appUserService.save(user);
			
			loggerConfiguration.logInfoMessage("Email [" + user.getEmail() + "] successfully registered");
			
			try {
				notificationService.notify(user, Constants.ACTIVATE_NOTIFICATION_QUEUE);
			} catch (TimeoutException te) {
				loggerConfiguration.logErrorMessage("Register TimeoutException [" + te.getMessage() + "] for email [" + user.getEmail() + "]");
			}
			
			loggerConfiguration.logInfoMessage("Email [" + user.getEmail() + "] completed notification precess after registration");
			
			return "0";
		}else {
			loggerConfiguration.logInfoMessage("Email [ " + user.getEmail() + "] is not available, it already exists in database");
					
			return "Correo ya registrado. Intenta con otro";
		}
	}
	
	@RequestMapping("/register/available")
	@ResponseBody
	public String available(@RequestParam String registerEmail) {
		Boolean available = appUserService.findByEmail(registerEmail) == null;
		
		return available.toString();
	}
}