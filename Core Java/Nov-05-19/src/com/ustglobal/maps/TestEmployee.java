package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		Employee s1 = new Employee(1 , "Munna", 97.336);
		Employee s2 = new Employee(2, "raja", 57.36);
		Employee s3 = new Employee(8, "Anitha", 88.21);
		Employee s4 = new Employee(5, "Rani", 87.214);
		Employee s5 = new Employee(6, "Muddi", 87.2145);
		Employee s6 = new Employee(10, "Mantri", 74.213);
		Employee s7 = new Employee(7, "police", 10.36545);
		Employee s8 = new Employee(9, "Manu", 85.124);
		Employee s9 = new Employee(12, "Chand", 68.12);

		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);

		ArrayList<Employee> arr1 = new ArrayList<Employee>();		
		arr1.add(s4);
		arr1.add(s5);
		arr1.add(s6);

		ArrayList<Employee> arr2 = new ArrayList<Employee>();
		arr2.add(s7);
		arr2.add(s8);
		arr2.add(s9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		hm.put("first", arr);
		hm.put("second", arr1);
		hm.put("third", arr2);

		ArrayList<Employee> first = hm.get("first"); 
		
		System.out.println("-------first---------");
		
		Iterator<Employee> it = first.iterator();
		while (it.hasNext()) {
			Employee s = it.next();
			System.out.println(s);
		}

		System.out.println("------second--------");

		ArrayList< Employee> second = hm.get("second");
		Iterator<Employee> it1 = second.iterator();
		while (it1.hasNext()) {
			Employee s = it1.next();
			System.out.println(s);
		}
		
		System.out.println("------third--------");

		ArrayList< Employee> third = hm.get("third");
		Iterator<Employee> it2 = third.iterator();
		while (it2.hasNext()) {
			Employee s = it2.next();
			System.out.println(s);
		}
	}

}
