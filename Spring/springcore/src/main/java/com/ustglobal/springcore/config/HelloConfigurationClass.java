package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.HelloPeople;
import com.ustglobal.springcore.di.Human;
import com.ustglobal.springcore.di.Pet;


@Configuration
@Import (PetConfigurationClass.class)
public class HelloConfigurationClass  {
	
	@Bean(name = "helloPeople")
	public HelloPeople getHelloPeople() {
		HelloPeople people = new HelloPeople();
		people.setMessage("UstGlobal company employee");
		return people;
	}
	
	
}
