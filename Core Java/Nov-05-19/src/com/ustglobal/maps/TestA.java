package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Munna", 874515);
		hm.put("Raja", 754123);
		hm.put("Rahi", 465);
		
		HashMap hm1 = new HashMap();
		hm1.put("Rani", 4212545);
		hm1.put("mantri", 41258793);
		hm1.put("kalla", 63255);
		
		hm.putAll(hm1);
		
		boolean hasKey = hm.containsKey("Munna");
		System.out.println("has key "+hasKey);
		
		boolean hasValue = hm.containsValue(465);
		System.out.println("Has value "+hasValue);
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
	}

}
