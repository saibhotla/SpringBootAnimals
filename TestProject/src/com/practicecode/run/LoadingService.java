package com.practicecode.run;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.practicecode.objects.Animal;
import com.practicecode.objects.Animal;

@Configuration
public class LoadingService {

	List<Animal> Animals;

	public void load() {
		Animals = new ArrayList<Animal>();

		// Insert Records
		insertRecords();

		System.out.println("Done loading: " + Animals.toArray().toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// Wait time
			e.printStackTrace();
		}

	}

	public void insertRecords() {
		
		

	}

}
