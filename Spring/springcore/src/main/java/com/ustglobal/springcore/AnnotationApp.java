package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.HelloPeople;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
			HelloPeople people = context.getBean(HelloPeople.class);
			System.out.println(people.getMessage());

			HelloPeople people1 = context.getBean(HelloPeople.class);
			System.out.println(people);
			System.out.println(people1);
			System.out.println("****************");
			Animal animal = context.getBean(Animal.class);
			animal.sound();
			System.out.println("*************");
			Pet pet = context.getBean(Pet.class);
			System.out.println(	pet.getName());
			pet.getAnimal().sound();

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
