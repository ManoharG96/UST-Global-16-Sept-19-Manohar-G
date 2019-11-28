package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Cow c = new Cow(1,"ganga",50000);
		Cow c1 = new Cow(2,"tunga",60000);
		Cow c2 = new Cow(3,"champa",30000);
		Cow c3 = c2;
		
		boolean isEqual = c.equals(c1);
		System.out.println(c.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(isEqual);
	}

}
