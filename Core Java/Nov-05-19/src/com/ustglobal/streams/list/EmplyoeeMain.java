package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ustglobal.maps.Employee;

public class EmplyoeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(14, "Munna",21.4);
		Employee e2 = new Employee(15, "goodboy", 21.54);
		Employee e3 = new Employee(4, "Sort", 45.12);
		Employee e4 = new Employee( 06, "Chand", 45.21);
		
		Comparator<Employee> comp = (i, j)->{
			if (i.id> j.id)
				return 1;
			else if (i.id < j.id)
				return -1;
			else 
				return 0;
		};
		
		Comparator< Employee> cmp = (k,l)->{
			return k.name.compareTo(l.name);
		};
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		List<Employee> l = al.stream().sorted(comp).collect(Collectors.toList());
		
		Iterator< Employee> it = l.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
		}
		System.out.println("******************");
	List<Employee> l1 = al.stream().sorted(cmp).collect(Collectors.toList());
		
		Iterator< Employee> it1 = l1.iterator();
		while (it1.hasNext()) {
			Employee e = it1.next();
			System.out.println(e);
		}

	}

}
