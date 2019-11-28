package com.ustglobal.lambaexpression;

public class TestHi {

	public static void main(String[] args) {
		TestInterface print = ()->{
			System.out.println("hi");
			return null;
		};
		String mess = print.sayHi();
		System.out.println(mess);
	}

}
