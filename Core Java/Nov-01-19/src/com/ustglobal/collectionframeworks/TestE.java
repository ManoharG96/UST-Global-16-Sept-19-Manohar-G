package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(123);
		l.add("Munna");
		l.add(12454858l);
		l.add(8455.21f);
		l.add(true);
		
		ListIterator lt = l.listIterator();
		while (lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("----------previous--------------");
		while (lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}

	}

}
