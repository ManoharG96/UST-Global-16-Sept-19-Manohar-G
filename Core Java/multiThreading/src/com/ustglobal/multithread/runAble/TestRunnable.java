package com.ustglobal.multithread.runAble;

public class TestRunnable {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		MyRunable run = new MyRunable(); 
		
		/* run.start() 
		* start() method is not decleared in MyRunnable class.
		* it is present in thread class so create the object for thread
		* 
		*/
		
		Thread thread = new Thread(run);
		thread.start();
		System.out.println("Main method ended");	
	}
}
