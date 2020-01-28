package mx.christez.medstory.configuration;

import org.apache.log4j.Logger;

public class LoggerConfiguration {
	private Logger processLogger = Logger.getLogger("process");
	
	public void logDebugMessage(String message) {
		processLogger.debug(message);
	}
	
	public void logErrorMessage(String message) {
		processLogger.error(message);
	}
	
	public void logInfoMessage(String message) {
		processLogger.info(message);
	}
	
	public void logWarnMessage(String message) {
		processLogger.warn(message);
	}
}
