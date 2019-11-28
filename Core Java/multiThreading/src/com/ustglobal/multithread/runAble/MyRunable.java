package com.ustglobal.multithread.runAble;

public class MyRunable implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("run() in MyRunnable");
		}
	}
}
