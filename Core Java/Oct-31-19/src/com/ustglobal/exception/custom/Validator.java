package com.ustglobal.exception.custom;

public class Validator {
	public void ageValidate(int age) {
		if (age< 18)
			throw new InvalidAgeException("Age----- above 18+");
	}
}
