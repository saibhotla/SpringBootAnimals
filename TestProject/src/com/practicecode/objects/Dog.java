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
	
	@Autowired
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.print("WOOF");
		
	}
	
	@Autowired
	public Movement getMovement() {
		return movement;
	}

	@Autowired
	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	@Autowired
	public Name getName() {
		return name;
	}

	@Autowired
	public void setName(Name name) {
		this.name = name;
	}
}
