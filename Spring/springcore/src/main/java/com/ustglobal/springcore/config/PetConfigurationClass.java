package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.HelloPeople;
import com.ustglobal.springcore.di.Human;
import com.ustglobal.springcore.di.Pet;

@Configuration
public class PetConfigurationClass  {
	
	@Bean (name = "cat")
	public Cat getCat() {
		return new Cat();	
	}
	
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Raju");
		pet.setAnimal(getCat());
		return pet;
	}
}
