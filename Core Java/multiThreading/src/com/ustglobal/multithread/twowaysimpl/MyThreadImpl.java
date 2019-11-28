package com.ustglobal.multithread.twowaysimpl;

import com.ustglobal.multithread.MyThread;

public class MyThreadImpl extends Thread  {

	public static void main(String[] args) {

		System.out.println("Main method started");

		Thread.currentThread().setName("Munna");
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread name is "+threadName);

		MyThread thread = new MyThread();
		String setName = thread.getName();
		System.out.println("Resetting the thread name: "+setName);

		Thread.currentThread().setName("Bala");
		thread.setName("Golu");
		System.out.println("MyThread name: "+thread.getName());


		int priority = Thread.currentThread().getPriority();
		System.out.println("default thread priority is: "+priority);

		Thread.currentThread().setPriority(8);
		int priority1 = Thread.currentThread().getPriority();
		System.out.println("Setting the priority: "+priority1);
		
		MyThreadImpl thread1 = new MyThreadImpl();
		thread1.setPriority(4);
		int priority2 = Thread.currentThread().getPriority();
		System.out.println("Again setting the priority by the object: "+priority2);
		
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			System.out.println("Arthematic exception is handled");
		}


		System.out.println("Main method ended");

	}

}
