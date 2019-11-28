package com.ustglobal.multithread.pausing;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("thread() in MyThread");
			Thread.yield();
		}
	}
}
