package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestB {

	public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("Patna", 8800000);
		lh.put("Bangalore", 560012);
		lh.put("Hariyana", 134203);
		
		//lh.put(null, 583115);
		
		for (Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			int val1 = m.getValue();
			System.out.println("key "+key+" value "+val1);
			System.out.println("-------------------");
		}

	}

}
