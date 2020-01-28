package mx.christez.medstory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.christez.medstory.configuration.Constants;
import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.exception.NoUserFoundException;
import mx.christez.medstory.exception.UserNotActiveException;
import mx.christez.medstory.service.AppUserService;
import mx.christez.medstory.service.NotificationService;

@Controller
public class RecoverController {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private AppUserService appUserService;
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping(value = "/recover", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String doRegister(@RequestBody AppUser user) {
		loggerConfiguration.logInfoMessage("Attempt to recover password for email [" + user.getEmail() + "]");
		
		try {
			AppUser appUser = appUserService.recover(user.getEmail());
			
			loggerConfiguration.logInfoMessage("Password successfully recovered for email [" + user.getEmail() + "]");
			
			notificationService.notify(appUser, Constants.RECOVER_NOTIFICATION_QUEUE);
			
			loggerConfiguration.logInfoMessage("Email [" + appUser.getEmail() + "] completed notification process after recovering password");
			
			return "0";
		}catch(NoUserFoundException nufe) {
			loggerConfiguration.logErrorMessage("Recover password NoUserFoundException [" + nufe.getMessage() + "] for email [" + user.getEmail() + "]");
			
			return nufe.getMessage();
		}catch(UserNotActiveException unae) {
			loggerConfiguration.logErrorMessage("Recover password UserNotActiveException [" + unae.getMessage() + "] for email [" + user.getEmail() + "]");
			
			return unae.getMessage();
		}
	}
}