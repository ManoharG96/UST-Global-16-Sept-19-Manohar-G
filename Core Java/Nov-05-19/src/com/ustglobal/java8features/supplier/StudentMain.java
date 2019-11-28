package com.ustglobal.java8features.supplier;

import java.util.function.Supplier;

public class StudentMain {

	public static void main(String[] args) {
		
		Supplier<Student> s = ()-> new Student(12, "Munna", 87.235);
		Student s1 = s.get();
		System.out.println(s1);
		
		Supplier< Integer> i = ()->20;
		int val = i.get();
		System.out.println("value "+val);
		
		Supplier<String> sp = ()-> "Good Evening";
		String v = sp.get();
		System.out.println("Value string "+v);
		
	
	}

}
