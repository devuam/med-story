package mx.christez.medstory.service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import mx.christez.medstory.configuration.JmsConfiguration;
import mx.christez.medstory.configuration.LoggerConfiguration;
import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.JmsMessage;

@Service
public class NotificationService {
	@Autowired
	private LoggerConfiguration loggerConfiguration;
	
	@Autowired
	private ConnectionFactory connectionFactory;
	
	@Autowired
	private JmsConfiguration jmsConfiguration;
	
	@Autowired
	private JmsMessageService jmsMessageService;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public void notify(AppUser user, String queue) throws TimeoutException {
		if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
			loggerConfiguration.logDebugMessage("Attempt to send the message to queue [" + queue + "] for email ["+ user.getEmail() + "]");
		
		try {
			if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
				loggerConfiguration.logDebugMessage("Connecting to the factory of the queue [" + queue + "] for email ["+ user.getEmail() + "]");
			
			Connection connection = connectionFactory.newConnection();
			
			if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
				loggerConfiguration.logDebugMessage("Creating channel of the queue [" + queue + "] for email ["+ user.getEmail() + "]");
			
			Channel channel = connection.createChannel();
			
			if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
				loggerConfiguration.logDebugMessage("Declaring queue [" + queue + "] for email ["+ user.getEmail() + "]");
			
			channel.queueDeclare(queue, true, false, false, null);
			
			if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
				loggerConfiguration.logDebugMessage("Setting data of queue [" + queue + "] for email ["+ user.getEmail() + "]");
			
			jmsConfiguration.setEmail(user.getEmail());
			jmsConfiguration.setPassword(user.getPassword());
			
			if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
				loggerConfiguration.logDebugMessage("Publishing message in queue [" + queue + "] for email ["+ user.getEmail() + "]");
			
			channel.basicPublish("", queue, null, objectMapper.writeValueAsString(jmsConfiguration).getBytes());
			
			if(System.getProperty("LOG_LEVEL", "INFO").equals("DEBUG"))
				loggerConfiguration.logDebugMessage("Closing channel and connection of queue [" + queue + "] for email ["+ user.getEmail() + "]");
			
			channel.close();
			connection.close();
		}catch(IOException ioe) {
			loggerConfiguration.logErrorMessage("Notify IOException [" + ioe.getMessage() + "] for email [" + user.getEmail() + "]");
			
			loggerConfiguration.logInfoMessage("Storing Jms message for email [" + user.getEmail() + "] to process later");
			
			jmsMessageService.saveUnsentMessage(new JmsMessage(user.getEmail(), user.getPassword(), queue));
		}
	}
}
