package com.ustglobal.oct_24_19.typecasting.primitive;

public class TypeCasting {
	public static void main(String[] args) {
		byte a=10;
		int b=a;//implicit casting
		System.out.println(b);
		System.out.println("----------");
		
		int c=20;
		byte d=(byte) c; //explicit casting
		System.out.println(d);
		System.out.println("----------");
		double e=23.542;
		int f=(int) e;
		System.out.println(f);
	}
}
