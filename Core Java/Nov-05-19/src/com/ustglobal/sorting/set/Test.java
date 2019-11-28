package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.ustglobal.maps.Employee;

public class Test {

	public static void main(String[] args) {
		Comparator<Employee> comp = (e1,e2)->{
			if (e1.height> e2.height)
				return 1;
			else if ( e1.height < e2.height)
				return -1;
			else 
				return 0;
		};

		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(14, "Munna",21.4);
		Employee e2 = new Employee(15, "goodboy", 21.54);
		Employee e3 = new Employee(4, "Sort", 45.12);
		Employee e4 = new Employee( 06, "Chand", 45.21);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("---using iterator----");
		Iterator<Employee > it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
		}
	}

}
