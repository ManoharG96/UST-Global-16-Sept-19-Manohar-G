package com.ustglobal.exception.first;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		String s = "munna";
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
		}
		catch (NullPointerException e) {
			System.out.println("String cant be null");
		}
		System.out.println("Main method ended");
	}
}
