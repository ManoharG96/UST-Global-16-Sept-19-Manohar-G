package com.ustglobal.has_a_realtion;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Meow",22);
		System.out.println(p.name+" "+p.age);
		p.m.write();
		p.eat();
	}

}
