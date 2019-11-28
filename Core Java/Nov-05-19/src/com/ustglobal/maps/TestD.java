package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestD {

	public static void main(String[] args) {
		Student s1 = new Student(1 , "Munna", 97.336);
		Student s2 = new Student(2, "raja", 57.36);
		Student s3 = new Student(8, "Anitha", 88.21);
		Student s4 = new Student(5, "Rani", 87.214);
		Student s5 = new Student(6, "Muddi", 87.2145);
		Student s6 = new Student(10, "Mantri", 74.213);
		Student s7 = new Student(7, "police", 10.36545);
		Student s8 = new Student (9, "Manu", 85.124);
		Student s9 = new Student(12, "Chand", 68.12);
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		ArrayList<Student> arr1 = new ArrayList<Student>();		
		arr1.add(s4);
		arr1.add(s5);
		arr1.add(s6);
		
		ArrayList<Student> arr2 = new ArrayList<Student>();
		arr2.add(s7);
		arr2.add(s8);
		arr2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
 		hm.put("first", arr);
		hm.put("second", arr1);
		hm.put("third", arr2);
		
		ArrayList<Student> first = hm.get("first");  
		
		Iterator<Student> it = first.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
	}

}
