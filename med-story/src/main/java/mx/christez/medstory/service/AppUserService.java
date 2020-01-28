package mx.christez.medstory.service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.Role;
import mx.christez.medstory.exception.NoUserFoundException;
import mx.christez.medstory.exception.UserNotActiveException;
import mx.christez.medstory.repository.AppUserRepository;
import mx.christez.medstory.repository.RoleRepository;

@Transactional
@Service
public class AppUserService {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public AppUser findByEmail(String email) {
		return appUserRepository.findByEmail(email);
	}
	
	public void save(AppUser appuser) {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Disabling, encrypting and assigning role for email ["+ appuser.getEmail() + "]");
		
		appuser.setEnabled(false);

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		appuser.setPassword(encoder.encode(appuser.getPassword()));
		
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleRepository.findByName("ROLE_USER"));
		appuser.setRoles(roles);

		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Calling JPA repository for email ["+ appuser.getEmail() + "]");
		
		appUserRepository.save(appuser);
	}
	
	@Transactional
	public AppUser recover(String email) throws NoUserFoundException, UserNotActiveException {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Looking for email ["+ email + "] to recover password");
		
		AppUser appUser = appUserRepository.findByEmail(email);
		
		if(appUser == null)
			throw new NoUserFoundException();
		
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Email ["+ email + "] found to recover password");
		
		if(!appUser.isEnabled())
			throw new UserNotActiveException();
		
		return updatePassword(appUser);
	}
	
	@Transactional
	private AppUser updatePassword(AppUser appUser) {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Updating password of email ["+ appUser.getEmail() + "] to recover it");
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Random random = new SecureRandom();

		String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789#$%+*.";
		String temporalPassword = "";

		for (int counter = 0; counter < 10; counter++) {
			int index = (int)(random.nextDouble() * letters.length());
			temporalPassword += letters.substring(index, index + 1);
		}

		appUser.setPassword(encoder.encode(temporalPassword));
		
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Password successfully updated for email ["+ appUser.getEmail() + "] to recover it");
		
		AppUser returnUser = new AppUser();
		returnUser.setEmail(appUser.getEmail());
		returnUser.setPassword(temporalPassword);
		
		return returnUser;
	}
}
