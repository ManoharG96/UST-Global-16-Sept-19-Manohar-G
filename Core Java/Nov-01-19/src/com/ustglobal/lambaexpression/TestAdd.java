package com.ustglobal.lambaexpression;

public class TestAdd implements AddInterface {

	public static void main(String[] args) {
		TestAdd a = new TestAdd();
		int sum  = a.add(12, 13);
		System.out.println("Sum: "+sum);

	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
