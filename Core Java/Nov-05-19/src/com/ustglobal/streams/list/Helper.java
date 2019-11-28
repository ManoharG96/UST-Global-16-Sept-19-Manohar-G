package com.ustglobal.streams.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;
import com.ustglobal.maps.Student;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {
		Iterator< Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}
	void displayFailedStudent(ArrayList<Student> arr) {
		List<Student> l = arr.stream().filter(Student->Student.percent<=40).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}

	Comparator<Student> comp = (i,j)->{
		if (i.percent> j.percent)
			return 1;
		else if (i.percent < j.percent)
			return -1;
		else 
			return 0;
	};

	void displayTopperStudent(ArrayList<Student> arr) {
		Student l = arr.stream().max(comp).get();
		System.out.println(l);

	}
	void displayLowestStudent(ArrayList<Student> arr) {
		Student l = arr.stream().min(comp).get();
		System.out.println(l);

	}
}
