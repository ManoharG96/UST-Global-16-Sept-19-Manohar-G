package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(10, "vinod", 75);
		System.out.println(s);
		int h = s.hashCode();
		System.out.println(h);
	}

}
