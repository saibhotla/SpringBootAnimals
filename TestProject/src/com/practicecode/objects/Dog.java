package com.practicecode.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
	private Movement movement;
	private Name name;

	@Autowired
	public Dog(Movement movement, Name name) {
		this.movement = movement;
		this.name = name;
		System.out.println(name.toString() + " Says");
	}
	
	public void bark() {
		System.out.print("WOOF");
		
	}
}
