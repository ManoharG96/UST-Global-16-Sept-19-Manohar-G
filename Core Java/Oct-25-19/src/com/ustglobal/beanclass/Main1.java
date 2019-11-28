package com.ustglobal.beanclass;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		System.out.println("age is "+age);
		
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("name "+name);
		
		sc.close();

	}

}
