package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component ("pet")
public class Pet {

	public Pet() {
		
	}
	public Pet(String name, Animal animal) {
		this.name = name;
		this.animal = animal;
	}
	private String name;
	@Autowired
	@Qualifier("cat")
	private Animal animal;	
}
