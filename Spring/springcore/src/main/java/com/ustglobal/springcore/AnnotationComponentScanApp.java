package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ComponentScanConfiguration;
import com.ustglobal.springcore.di.HelloPeople;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
			HelloPeople people = context.getBean(HelloPeople.class);
			people.setMessage("Hello hi I am from AnnotationComponentScanApp");
			System.out.println(people.getMessage());

			Pet pet = context.getBean(Pet.class);
			pet.setName("Google");
			System.out.println(pet.getName());
			pet.getAnimal().sound();

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
