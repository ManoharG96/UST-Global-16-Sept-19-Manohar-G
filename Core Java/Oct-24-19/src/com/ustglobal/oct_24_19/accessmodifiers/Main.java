package com.ustglobal.oct_24_19.accessmodifiers;

public class Main extends TestA {
	public static void main(String[] args) {
		TestA t = new TestA();
		t.Null();
		t.sum();
		t.mull();
		
		Main m = new Main();
		m.Null();
		System.out.println(m.name);
	}
}
