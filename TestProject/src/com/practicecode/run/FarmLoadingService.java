package com.practicecode.run;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.practicecode.objects.Animal;
import com.practicecode.objects.Dog;
import com.practicecode.objects.Animal;

@Configuration
public class FarmLoadingService {

	List<Animal> Animals;

	public void load() {
		loadDogs();

	}

	public void loadDogs() {

		//// Creating generic integer ArrayList
		Dog labrador = null;
		Dog germanShephard = null;
		Dog chihuaha = null;
		loadDogContext(labrador, germanShephard, chihuaha);

	}

	public List<Animal> loadDogContext(Dog... dog) {
		List<Dog> dogs = new ArrayList<Dog>();
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Animal.class);
		for (Dog doggie : dogs) {

			doggie = context.getBean(Dog.class);

			Animals.add(doggie);
		}

		return Animals;

	}
}
