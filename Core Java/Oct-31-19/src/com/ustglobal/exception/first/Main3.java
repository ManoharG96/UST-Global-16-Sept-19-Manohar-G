package com.ustglobal.exception.first;

public class Main3 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		int[] arr = {10,20,30};

		int a = 10;
		int b = 0;

		try {

			int c = a/b;
			System.out.println(c);

		} 
		catch (ArithmeticException e) {

			System.out.println("zero cant be divided with any number ");

		}
		try {

			System.out.println(arr[1]);
			System.out.println(arr[3]);

		}
		catch (ArrayIndexOutOfBoundsException e){

			System.out.println("correct the index for the array");

		}
		
		System.out.println("Main method ended");

	}
}
