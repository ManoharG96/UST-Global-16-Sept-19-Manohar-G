package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class EmplyoeeMain {

	public static void main(String[] args) {
		Predicate<Emplyoee> p = s->(s.salary>=35025);
		
		Emplyoee e1 = new Emplyoee (1, "Munna", 254000);
		boolean value = p.test(e1);
		System.out.println(value);
		
	}

}
