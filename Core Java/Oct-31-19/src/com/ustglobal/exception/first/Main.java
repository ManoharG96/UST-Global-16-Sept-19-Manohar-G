package com.ustglobal.exception.first;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] arr = {10,20,30};
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println(arr[1]);
			System.out.println(arr[2]);	
//		}catch (ArrayIndexOutOfBoundsException e){
//			System.out.println("correct the index for the array");	
//		}catch (ArithmeticException e) {
//			System.out.println("zero can't be divided with any number ");	
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception occurred");
		}
		System.out.println("Main method ended");
	}
}
