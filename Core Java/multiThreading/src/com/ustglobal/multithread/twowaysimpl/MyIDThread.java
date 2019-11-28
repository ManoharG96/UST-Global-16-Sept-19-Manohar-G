package com.ustglobal.multithread.twowaysimpl;

public class MyIDThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main method started");

		System.out.println("Current thread id is: "+Thread.currentThread().getId());

		/*MyIDThread id = new MyIDThread();
		 * id.setId();
		 * you cant set the id for the thread
		 */

		System.out.println("priority: "+Thread.currentThread().getPriority());

		/*Thread.currentThread().setPriority(12);
		 * System.out.println("Setting the priority above 10 and below 1 "+Thread.currentThread().getPriority());
		 * you cant set the priority above 10 or below 1, it will throws IllegalArgumentException
		 */

		System.out.println("Main method ended");
	}
}
