package com.practicecode.run;

import org.springframework.context.annotation.Configuration;

@Configuration
public class main {

	public static void main(String[] args) {
		// Load Spring
		loadSpring();
		
		FarmLoadingService farmload = new FarmLoadingService();
		farmload.load();

	}

	private static void loadSpring() {
		// Loads Context
		try {
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
		


	

}
