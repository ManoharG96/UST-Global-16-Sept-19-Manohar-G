package com.ustglobal.multithread.pausing;

public class TestThread {

	public static void main(String[] args) {

		System.out.println("Main() started");
		
		MyThread thread = new MyThread();
		thread.start();
		for (int i=0; i<5; i++) {
			System.out.println("Main class thread");
		}
		
		System.out.println("Main() ended");
	}

}
