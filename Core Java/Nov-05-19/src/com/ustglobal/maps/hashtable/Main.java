package com.ustglobal.maps.hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(12, "Munna");
		ht.put(03, "boew");
		ht.put(10, "meow");
		ht.put(07, "mantri");
		ht.put(05, "Rani");
		ht.put(15, "ufff");
		ht.put(18, "John"); 
		ht.put(01, "Bow Bow");

		for (Entry<Integer, String> h : ht.entrySet())
			System.out.println("key "+h.getKey()+" value "+h.getValue());

	}

}
