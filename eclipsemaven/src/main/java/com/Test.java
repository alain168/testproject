package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static Logger logger = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
		logger.trace("Entering application.");
		logger.info("this is dev3");
		logger.trace("Exiting application.");
	}

}
