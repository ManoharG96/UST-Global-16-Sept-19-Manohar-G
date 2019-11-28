package com.ustglobal.multithread;

public class MyThread extends Thread {

	public void run(){
		for(int i=0; i<10; i++) {
			System.out.println("MyThread run()");
		}
	}

	/*public void run(int i) {
		for(int j=0; j<i; j++) {
			System.out.println("MyThread run(int i)");
		}	
	}
	* dont overload the run method. if you overload run method their is no use 
	* always start() will call no parameter run method 
	*/



}
