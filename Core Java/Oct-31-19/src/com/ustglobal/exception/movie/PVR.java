package com.ustglobal.exception.movie;

public class PVR {
	void book() {
		System.out.println("booking started");
		try {
			System.out.println(10/0);
			System.out.println("Logic for booking");
			System.out.println("tickets are booked");
		}catch(ArithmeticException e) {
			System.out.println("booking failed");
			throw e;
		}
	}
}
