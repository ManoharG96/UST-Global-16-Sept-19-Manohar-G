package com.ustglobal.exception.tryresource;

import java.util.Scanner;

import com.ustglobal.exception.custom.InvalidAgeException;

public class TryWithResource {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter the age");
			int age = sc.nextInt();
			System.out.println("Age is "+age);
			if (age<18) {
				throw new InvalidAgeException("Age---- above 18");
			}
		}catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block excuited");
		}
	}
}
