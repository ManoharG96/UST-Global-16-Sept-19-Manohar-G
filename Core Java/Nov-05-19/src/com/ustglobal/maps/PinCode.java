package com.ustglobal.maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PinCode {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bangalore", 560012);
		lh.put("Hariyana", 134203);
		lh.put("Patna", 8800000);

		System.out.println(lh);

		Set< String > s = lh.keySet();
		Iterator<String > it = s.iterator();
		while (it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}


		System.out.println("----------------");
		Collection<Integer> val = lh.values();
		Iterator<Integer> it1 = val.iterator();
		while (it1.hasNext()) {
			int s1 = it1.next();
			System.out.println(s1);
		}

		System.out.println("------------");
		for (Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			int val1 = m.getValue();
			System.out.println("key "+key+" value "+val1);
		}

	}
}
