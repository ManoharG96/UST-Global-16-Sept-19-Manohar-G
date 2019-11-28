package com.ustglobal.collectionframeworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestF {

	public static void main(String[] args) {
		Vector l = new Vector();
		l.add(123);
		l.add("Munna");
		l.add(12454858l);
		l.add(8455.21f);
		l.add(true);
		System.out.println("--------ListIterator----------");
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
		System.out.println("-----------Iterator---------");
		Iterator t = l.iterator();
		while (t.hasNext()) {
			Object o = t.next();
			System.out.println(o);
		}

	}

}
