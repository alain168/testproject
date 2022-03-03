package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static Logger logger = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
		logger.trace("Entering application.");
		logger.info("this is dev7");
		logger.trace("Exiting application.");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
}
