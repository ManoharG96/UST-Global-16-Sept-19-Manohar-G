package com.ustglobal.exception.paytm;

public class Main {

	public static void main(String[] args) {
		Paytm p = new Paytm();
		try {
			p.conform();
		}
		catch(ArithmeticException e) {
			System.out.println("Booking failed and its done in main method");
		}
		finally {
			System.out.println("finally block is excuited in main method");
		}
	}

}
