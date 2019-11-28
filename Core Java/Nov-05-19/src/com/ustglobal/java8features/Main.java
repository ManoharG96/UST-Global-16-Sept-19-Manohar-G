package com.ustglobal.java8features;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Predicate<Integer> p = i-> (i%2==0);
		boolean value = p.test(7);
		System.out.println(value);
	}

}
