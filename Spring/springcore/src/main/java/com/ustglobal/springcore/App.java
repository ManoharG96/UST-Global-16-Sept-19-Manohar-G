package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.HelloPeople;
import com.ustglobal.springcore.di.Pet;

public class App {
	public static void main(String[] args ){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloPeople obj = (HelloPeople) context.getBean("helloPeople");
		obj.getMessage();
		System.out.println("***************");
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().sound();
		System.out.println("****************");
		
		System.out.println(obj.getMap());
		
		ClassPathXmlApplicationContext contextClose = (ClassPathXmlApplicationContext) context;  
		contextClose.close();
	}
}
