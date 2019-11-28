package com.ustglobal.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("Munna");
		al.add(28.456);
		al.add(true);
		al.add('A');
		al.add(123l);
		al.add(215.236f);
		
		for (int i=0; i<7; i++) {
			Object ob = al.get(i);
			System.out.println(ob);
		}
		
		System.out.println("*************");
		
		Iterator i =al.iterator();
			while (i.hasNext()) {
				Object o = i.next();
				System.out.println(o);
			}
		
		}
	}