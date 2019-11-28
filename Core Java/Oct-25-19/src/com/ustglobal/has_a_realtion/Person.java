package com.ustglobal.has_a_realtion;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Marker m = new Marker("Red", 25);
	void sleep() {
		System.out.println("Person can sleep");
	}
	void eat() {
		System.out.println("Person can eat");
	}
}
