package com.ustglobal.collectionframeworks;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("Munna");
		al.add(28.456);
		al.add(true);
		al.add('A');
		al.add(123l);
		al.add(215.236f);
		
		for (Object o : al)
			System.out.println(o);
		
	}
}
