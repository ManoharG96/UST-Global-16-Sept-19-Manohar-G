package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Car c = new Car(2000,"maruthi","red");
		int h = c.hashCode();
		System.out.println(c);
		System.out.println(h);
	}

}
