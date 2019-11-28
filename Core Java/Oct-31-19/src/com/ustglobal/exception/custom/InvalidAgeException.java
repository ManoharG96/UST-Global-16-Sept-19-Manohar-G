package com.ustglobal.exception.custom;

public class InvalidAgeException extends RuntimeException { 
	//if the class extends RuntimeException then that class is Unchecked exception 
	private String s = "Invalid Age : Age should be 18+";


	public InvalidAgeException(String s) {
		super();
		this.s = s;
	}
	public InvalidAgeException() {

	}


	@Override
	public String getMessage() {
		return s;
	}
}
