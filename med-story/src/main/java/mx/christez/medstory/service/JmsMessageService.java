package mx.christez.medstory.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.JmsMessage;
import mx.christez.medstory.repository.JmsMessageRepository;

@Transactional
@Service
public class JmsMessageService {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private JmsMessageRepository jmsMessageRepository;
	
	public void saveUnsentMessage(JmsMessage jmsMessage) {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Attempt to save unsent jms message [" + jmsMessage.getEmail() + " | " + jmsMessage.getPassword() + "]");
		
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Calling JPA repository for unsetn jms message [" + jmsMessage.getEmail() + " | " + jmsMessage.getPassword() + "]");
		
		jmsMessageRepository.save(jmsMessage);
	}
}
