package com.ustglobal.exception.second;

public class Main {

	public static void main(String[] args) {
		try {
			for(int i = 0; i < 100; i++) {
				System.out.println("Waiting"+i);
				Thread.sleep(2500);
			}
		}catch (InterruptedException e) {
			System.out.println("exception is handled");
		}
	}
}
