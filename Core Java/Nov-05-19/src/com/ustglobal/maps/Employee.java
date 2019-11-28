package com.ustglobal.maps;

public class Employee {
	public int id;
	public String name;
	public double perIncome;
	public int height;
	
	public Employee(int id, String name, double perIncome) {
		super();
		this.id = id;
		this.name = name;
		this.perIncome = perIncome;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", peryearIncome%=" + perIncome + "]";
	}
	
	
}
