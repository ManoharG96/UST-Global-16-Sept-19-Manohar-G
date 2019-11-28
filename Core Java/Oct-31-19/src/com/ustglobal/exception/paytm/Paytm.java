package com.ustglobal.exception.paytm;

public class Paytm extends IRCTC {
	void conform(){
		IRCTC i = new IRCTC();
		//	try {
		i.book();
		System.out.println("Booking under Paytm");
		//	}catch(ArithmeticException e) {
		//		System.out.println("Booking under paytm is failed");
		//	}
	}
}
