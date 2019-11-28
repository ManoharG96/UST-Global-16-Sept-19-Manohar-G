package com.ustglobal.lambaexpression;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface mult = (a,b)->a*b; 
		int prod = mult.multiply(14, 15);
		System.out.println("Multiply of two numbers: "+prod);
	}

}
