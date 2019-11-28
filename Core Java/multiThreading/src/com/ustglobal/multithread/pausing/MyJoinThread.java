package com.ustglobal.multithread.pausing;

public class MyJoinThread extends Thread {

	@Override
	public void run() {
		
		for (int i=0; i<5; i++) {
			
			System.out.println("thread() in MyJoinThread");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}
