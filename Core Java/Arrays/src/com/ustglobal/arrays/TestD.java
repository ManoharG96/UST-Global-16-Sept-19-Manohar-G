package com.ustglobal.arrays;

public class TestD {
	public static void main(String[] args) {
		Student s1 = new Student(1, "arya" ,49.44);
		Student s2 = new Student(2, "priya" ,59.44);
		Student s3 = new Student(3, "surya" ,69.44);
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(Student s : students) {
			System.out.println(s);
		}
		receive(students);
		
		
	}
	static void receive(Student[] stu) {
		for(Student s : stu) {
			System.out.println(s);
		}
	}

}
