package com.practicecode.objects;

import org.springframework.beans.factory.annotation.Autowired;

public class Name {
	
	String name;
	
	@Autowired
	public Name(String name) {
		this.name = name;
	}
	
	@Autowired
	public Name() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
