package com.ustglobal.multithread.pausing;

public class Counter {
	
	public int v;
	
	synchronized public void increment() {
		Thread.currentThread().setPriority(4);
		v++;
	}
	
	synchronized public void decrement() {
		Thread.currentThread().setPriority(8);
		v--;
	}
	
	synchronized public void showCounter() {
		System.out.println("Value of counter: "+v);
	}
}
