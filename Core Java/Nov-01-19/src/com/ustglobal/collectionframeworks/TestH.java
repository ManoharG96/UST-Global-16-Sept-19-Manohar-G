package com.ustglobal.collectionframeworks;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student o = new Student(123, "Munna", 4568);
		Student o1 = new Student(4587, "Raju", 12458);
		Student o2 = new Student(840, "Gout", 54125);
 		al.add(o);
		al.add(o1);
		al.add(o2);
		
		System.out.println("------for each---------");
		for (int i=0; i<al.size(); i++) {
			Student s = al.get(i);
			System.out.println(s);
		}
		
	}

}
