package qbrainx.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {

	public static Logger logger = LogManager.getLogger(Log4JDemo.class);
	
	
	public static void main(String[] args) {

		System.out.println("\n Hello world...! \n");
	
	logger.trace(" This is an trace message ");
	logger.info(" This is an information message ");
	logger.error(" This is an error message ");
	logger.warn("This is an warning message ");
	logger.fatal("This is an fatal message ");
	
	System.out.println("\n Completed ");
	
	}

}
