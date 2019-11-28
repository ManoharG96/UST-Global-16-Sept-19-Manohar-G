package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class MarksTest {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(55);
		marks.add(97);
		marks.add(35);
		marks.add(45);
		marks.add(12);
		marks.add(85);
		marks.add(25);

		Comparator<Integer> cmp = (m1, m2)-> {
			if (m1>m2)
				return 1;
			else if (m1<m2);
				return -1;
		};
		

		long noOfStudentFailed = marks.stream().filter(i->i<40).count();
		System.out.println(noOfStudentFailed);
		
		int	minMarksStudents = marks.stream().min(cmp).get();
		System.out.println("Minimum marks student: "+minMarksStudents);
		
		int maxMarksStudent = marks.stream().max(cmp).get();
		System.out.println("Maximum marks student: "+maxMarksStudent);

	}

}
