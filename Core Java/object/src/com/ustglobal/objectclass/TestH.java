package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"manu",40000);
		Employee e2 = new Employee(101,"akshitha",30000);
		Employee e3 = new Employee(102,"vinod",50000);
		Employee e4 = e3;
		boolean isEqual = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEqual);
		}

}
