package com.kira.batch.core;

import org.apache.log4j.Logger;

public class StartBootRun {
	
	private static Logger logger = Logger.getLogger(StartBootRun.class);

	
	public static void main(String[] args) {
		
		Application app = new Application();
		
		app.run();
	}
	
	



}
