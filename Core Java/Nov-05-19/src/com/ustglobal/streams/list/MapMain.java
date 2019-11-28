package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(25);
		al.add(86);
		al.add(78);
		al.add(77);
		al.add(14);
		al.add(98);
		
		List<Integer> l = al.stream().map(i->i+50).collect(Collectors.toList());
		
		for (Integer i : l)
			System.out.println(i);

	}

}