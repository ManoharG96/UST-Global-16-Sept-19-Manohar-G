package com.ustglobal.java8features.predicate;

public class Emplyoee {
	
	int id;
	String name;
	double salary;
	
	@Override
	public String toString() {
		return "Emplyoee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Emplyoee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
