package com.ustglobal.java8features.functions;

import java.util.function.Function;

public class StudentMain {

	public static void main(String[] args) {
		Function<Integer, Student> f = id->{
			Student s = new Student(12, "Munna", 87.235);
			s.id = id;
			return s;
		};
		Student s = f.apply(12);
		System.out.println(s);
	}

}
