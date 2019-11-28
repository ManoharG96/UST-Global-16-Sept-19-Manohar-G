package com.ustglobal.java8features.consumer;

import java.util.function.Consumer;


public class StudentMain {

	public static void main(String[] args) {
		
	Consumer< Student> c = s -> {
		System.out.println("Id: "+s.id);
		System.out.println("Name: "+s.name);
		System.out.println("Percentage: "+s.percent);
		
	};
	Student s1 = new Student(14, "munna", 78.26);
	c.accept(s1);
	
	}

}
