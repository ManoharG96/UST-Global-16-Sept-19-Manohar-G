package com.ustglobal.collectionframeworks;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(123);
		al.add("Munna");
		al.add(28.456);
		al.add(true);
		al.add('A');
		al.add(12345l);
		al.add(215.236f);
		
		Object o = al.get(1);
		String s = (String)o;
		String s1 = s.toUpperCase();
		System.out.println(o);
		System.out.println(s1);
	}

}
