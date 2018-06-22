package com.practicecode.run;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.practicecode.objects.Animal;
import com.practicecode.objects.Dog;
import com.practicecode.objects.Movement;
import com.practicecode.objects.Name;
import com.practicecode.objects.Animal;

@Configuration
public class FarmLoadingService {

	List<Animal> Animals;

	public void load() {
		loadDogs();

	}

	public void loadDogs() {

		//// Creating generic integer ArrayList
		Dog labrador = new Dog(new Movement("sitting"), new Name("Jack"));
		labrador.bark();
		System.out.println();
		
		Dog germanShephard = new Dog(new Movement("sitting"), new Name("Bryan"));
		germanShephard.bark();
		System.out.println();
		
		
		Dog chihuaha = new Dog(new Movement("sitting"), new Name("Peter"));
		chihuaha.bark();
		System.out.println();

	}

	public void loadDogContext(Dog dog) {
		List<Dog> dogs = new ArrayList<Dog>();
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Animal.class);
		for (Dog doggie : dogs) {

			doggie = context.getBean(Dog.class);

			Animals.add(doggie);
		}

	}
}
