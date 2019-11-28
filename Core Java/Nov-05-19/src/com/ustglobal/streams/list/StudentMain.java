package com.ustglobal.streams.list;

import java.util.ArrayList;

import com.ustglobal.maps.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1 , "Munna", 97.336);
		Student s2 = new Student(2, "raja", 14.36);
		Student s3 = new Student(8, "Anitha", 88.21);
		Student s4 = new Student(5, "Rani", 87.214);
		Student s5 = new Student(6, "Muddi", 87.2145);
		Student s6 = new Student(10, "Mantri", 34.213);
		Student s7 = new Student(7, "police", 10.36545);
		Student s8 = new Student (9, "Manu", 85.124);
		Student s9 = new Student(12, "Chand", 68.12);
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		arr.add(s6);
		arr.add(s7);
		arr.add(s8);
		arr.add(s9);
		
		Helper h = new Helper();
		h.displayAllStudent(arr);
		System.out.println("*****************failed students*****************");
		h.displayFailedStudent(arr);	
		System.out.println("**************Topper Student*************");
		h.displayTopperStudent(arr);
		System.out.println("*****************Failed Student lowest marks*******");
		h.displayLowestStudent(arr);
		}

}
