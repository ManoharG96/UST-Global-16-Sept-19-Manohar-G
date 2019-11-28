package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;	
		System.out.println("a is "+a);
		Integer i = a;//boxing or auto boxing
		System.out.println("i is "+i);
		System.out.println("===========");
		Integer x = 10;
		//Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;//unboxing auto unboxing
		System.out.println("y is "+y);
		
		System.out.println("Parse phase");
		
		int value = Integer.parseInt("manu");
		System.out.println("value: "+value);
		boolean res = Boolean.parseBoolean("1234True");
		System.out.println("res: "+res);
	}
}
