package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Generics {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("munna");
		al.add("Raju");
		al.add("Nikki");
		
		Iterator <String>i = al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("-------------listIterator------- ");
		ListIterator<String> lt = al.listIterator();
		while (lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("-------------listIterator------- ");
		while (lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
		
	}

}
