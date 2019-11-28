package com.ustglobal.oct_24_19.typecasting.nonprimitive;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		Pen p1 = new Marker();//up casting
		System.out.println(p1.a);
		p1.write();	
		Marker m = (Marker)p1;//down casting
		m.colour();
		m.write();
		p.write();
		System.out.println(m.size);	
	}
}
