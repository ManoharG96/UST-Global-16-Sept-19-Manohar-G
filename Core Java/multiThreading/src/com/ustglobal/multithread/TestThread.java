package com.ustglobal.multithread;

public class TestThread {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		MyThread thread = new MyThread();
		thread.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
		
		/*thread.run();
		 * dont call the run(), it behave like a normal program
		 * all codes will excute inside the main thread only
		 * 
		 * thread.start(){
		 * System.out.println("Start method id overridder");
		 * }
		 * dont override the start method, if you override the start() program behave like normal program
		 * 
		 * thread.start();
		 * call start() once, don't call again once. if you call again it throws IllegalThreadException
		*/
		
		System.out.println("Main method ended");
	}

}
