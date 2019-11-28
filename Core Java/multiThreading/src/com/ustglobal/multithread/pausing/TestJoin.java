package com.ustglobal.multithread.pausing;

public class TestJoin {

	public static void main(String[] args) {

		System.out.println("Main method started");

		MyJoinThread threadJoin = new MyJoinThread();
		
		threadJoin.start();
		try {
			threadJoin.join(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main method ended");	
	}
}
