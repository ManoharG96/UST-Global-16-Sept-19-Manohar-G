package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.HelloPeople;
import com.ustglobal.springcore.di.Pet;

public class XMLComponentScanApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		HelloPeople people = context.getBean(HelloPeople.class);
		people.setMessage("Hello hi i am from XMLComponentScanApp");
		System.out.println(people.getMessage());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Siri");
		System.out.println(pet.getName());
		pet.getAnimal().sound();
	}

}
