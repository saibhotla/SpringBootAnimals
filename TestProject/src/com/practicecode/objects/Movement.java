package com.practicecode.objects;

import org.springframework.beans.factory.annotation.Autowired;

public class Movement {

	String movement;

	public Movement(String movement) {
		this.movement = movement;
	}

	@Autowired
	public Movement() {
	}

}
