package com.ustglobal.exception.custom;

public class Main {

	public static void main(String[] args) {
		Validator v = new Validator();
		try {
			v.ageValidate(12);
		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());	
		}
	}

}
