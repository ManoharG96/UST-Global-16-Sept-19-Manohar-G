package com.ustglobal.exception.first;

public class Main4 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		String s = "Munna";
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
		}
		catch (NullPointerException e) {
			System.out.println("String cant be null");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method ended");
	}
}
