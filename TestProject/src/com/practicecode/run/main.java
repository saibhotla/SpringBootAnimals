package com.practicecode.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.practicecode.objects.Animal;
import com.practicecode.objects.Dog;

@Configuration
public class main {

	public static void main(String[] args) {
		// Load Spring
		loadSpring();

	}

	private static void loadSpring() {
		// Loads Context
		try {
			@SuppressWarnings("resource")
			ApplicationContext context = new AnnotationConfigApplicationContext(Animal.class);
			Dog labrador = context.getBean(Dog.class);
			labrador.bark();	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
		
	private static void loadTheServletInitializer() {
		
		
		
	}

	

}
