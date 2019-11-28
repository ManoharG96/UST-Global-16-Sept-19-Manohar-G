package com.ustglobal.singletone;

public class TestSingletone {

	public static void main(String[] args) {
		
		MySingleTon obj = MySingleTon.getDbConnection();
		obj.s="Munna";
		System.out.println("Hashcode of obj: "+obj.hashCode());

		MySingleTon obj1 = MySingleTon.getDbConnection();
		obj1.s="Manu";
		System.out.println("Hashcode of obj: "+obj.equals(obj1));
	}
}
