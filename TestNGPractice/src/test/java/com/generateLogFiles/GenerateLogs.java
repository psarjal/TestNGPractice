package com.generateLogFiles;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class GenerateLogs {

	//public static void main(String[] args) {
		@Test
		public void dd() {
		Logger log= Logger.getLogger("Automation - ");
        PropertyConfigurator.configure("D:\\MyProjects\\TestNGPractice\\src\\test\\resources\\configFiles\\log4j.properties");
        
		System.out.println("This is step1.");
		log.info("First step is done.");
		
		System.out.println("This is step2.");
		log.info("Second step is done.");
		
		System.out.println("This is step3.");
		log.info("Third step is done.");
		
		System.out.println("This is step4.");
		log.info("Fourth step is done.");
		
		System.out.println("This is step5.");
		log.info("Fifth step is done.");

	}

}
