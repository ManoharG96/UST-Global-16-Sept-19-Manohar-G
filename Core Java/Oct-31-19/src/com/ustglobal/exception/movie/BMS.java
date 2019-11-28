package com.ustglobal.exception.movie;

public class BMS  {
	public static void main(String[] args) {
		
		PVR p = new PVR();
			try {
				p.book();
				System.out.println("Logic for booking the ticket");
				System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("Booking failed");
			}
			
		}
}

