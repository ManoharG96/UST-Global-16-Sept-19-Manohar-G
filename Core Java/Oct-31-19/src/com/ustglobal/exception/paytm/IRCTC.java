package com.ustglobal.exception.paytm;

public class IRCTC {
	public void book() {
		System.out.println("training ticket is booking");
		try {
			System.out.println("Logic for booking");
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Booking failed");
			throw e;
		}
	}
}
