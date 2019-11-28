package com.ustglobal.maps;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {
	public static void main(String[] args) {
		 
		HashMap hm = new HashMap();
		hm.put("Munna", 874515);
		hm.put("Raja", 754123);
		hm.put("Rahi", 465);
		hm.put(null, 45463);
		System.out.println(hm);
		hm.put("Raja", 54561);
		System.out.println("******-After modification-******");
		System.out.println(hm);
		System.out.println("-----------Adding duplicate---------");
		hm.put("Munna", 874515);
		System.out.println(hm);
		 System.out.println("");
		Object phoneno = hm.get("Munna");
		System.out.println(phoneno);
		
		Object phoneNo1= hm.get("Raja");
		System.out.println(phoneNo1);
		
		Object phoneno2 = hm.get("Munna1");
		System.out.println(phoneno2);
		
	
	}
}
