package com.ustglobal.beanclass;

public class Main {
	 public static void main(String[] args) {
		Student s = new Student();
		s.setId(123);
		s.setName("Rahitya");
		s.setRollNo(4568);
		
		DataBase db = new DataBase();
		db.receive(s);
		
		System.out.println("");
		 
		Employee e = new Employee();
		e.setName("Chandu");
		e.setId(123);
		e.setDept("Test Yentra");
		e.setDesignation("Teaching");
		e.setSalary(250000);
		
		db.database(e);
	}
}
