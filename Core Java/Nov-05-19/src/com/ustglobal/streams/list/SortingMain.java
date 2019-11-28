package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMain {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(55);
		marks.add(97);
		marks.add(35);
		marks.add(45);
		marks.add(12);
		marks.add(85);
		marks.add(25);
		
		List<Integer> l =marks.stream().sorted().collect(Collectors.toList());
		Iterator< Integer> it = l.iterator();
		System.out.println("------sorted----------");
		while (it.hasNext()) {
			int m = it.next();
					System.out.println(m);
		}

	}

}
