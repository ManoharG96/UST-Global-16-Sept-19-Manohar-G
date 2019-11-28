package com.ustglobal.multithread.pausing;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		Counter count = new Counter();
		Runnable r1 = ()->{
			for (int i = 0; i<199; i++) {
			count.increment();
			count.increment();
			count.increment();
			count.increment();
			}
			count.showCounter();
		};

		Runnable r2 = ()->{
			for (int i = 0; i<99; i++) {
			count.decrement();
			count.decrement();
			count.decrement();
			}
			count.showCounter();
		};

		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		thread1.start();
		thread2.start();

		System.out.println("Main ended");
	}

}
