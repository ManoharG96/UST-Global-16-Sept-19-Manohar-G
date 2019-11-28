package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.ListIterator;


public class TestC {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(123);
		al.add("Munna");
		al.add(28.456);
		al.add(true);
		al.add('A');
		al.add(12345l);
		al.add(215.236f);
		
		ListIterator lt = al.listIterator();
		while (lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("***************");
		while (lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}

	}

}
