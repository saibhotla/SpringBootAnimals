package com.practicecode.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
	private Movement movement;
	private Name name;

	@Autowired
	public Cat(Movement movement, Name name) {
		this.movement = movement;
		this.name = name;
		System.out.println(name.toString() + " Says");
	}
	
	public void purr() {
		System.out.print("MEOW");
		
	}

	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
}
