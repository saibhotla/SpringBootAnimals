package com.practicecode.objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practicecode.objects")
public abstract class Animal {

	@Bean
	Name name(String name) {
		return new Name(name);
	}

	@Bean
	Movement movement(String movement) {
		return new Movement(movement);
	}
	
	@Bean
	Dog dog() {
		return new Dog(this.movement("Running"),this.name("Jack"));
	}

}
