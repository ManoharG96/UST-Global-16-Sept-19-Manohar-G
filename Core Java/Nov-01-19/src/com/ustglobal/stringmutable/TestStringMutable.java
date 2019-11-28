package com.ustglobal.stringmutable;

public class TestStringMutable {
	
	public static void main(String[] args) {
		
		MyString m1 = new MyString(10, "Munna");
		MyString m2 = m1.changeContent(15,"Raju");
		
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println("Hash code of first object: "+m1.hashCode());
		System.out.println("Hash code of second object: "+m2.hashCode());
	}
}
