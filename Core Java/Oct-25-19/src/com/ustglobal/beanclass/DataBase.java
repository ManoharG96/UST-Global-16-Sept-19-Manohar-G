package com.ustglobal.beanclass;

public class DataBase {
	void receive(Student s) {
		System.out.println("Name: "+s.getName());
		System.out.println("Id: "+s.getId());
		System.out.println("RollNo: "+s.getRollNo());
	}
	void database(Employee e) {
		System.out.println("Name: "+e.getName());
		System.out.println("Id: "+e.getId());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Dept: "+e.getDept());
		System.out.println("Designation "+e.getDesignation());
	}
}
