package com.ustglobal.exception.customamount;

public class InvalidAmountException extends RuntimeException {
	private String message = "Daily limit is 10000";
	
	
	@Override
	public String getMessage() {	
		return message;
	}
	public InvalidAmountException() {

	}

	public InvalidAmountException(String message) {
		super();
		this.message = message;
	}
}
