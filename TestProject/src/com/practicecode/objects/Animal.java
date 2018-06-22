package com.practicecode.objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practicecode.objects")
public abstract class Animal {

	@Bean
	Name name() {
		return new Name();
	}

	@Bean
	Movement movement() {
		return new Movement();
	}
	
	@Bean
	Dog dog(Movement move, Name name) {
		return new Dog(movement(),name());
	}


}
