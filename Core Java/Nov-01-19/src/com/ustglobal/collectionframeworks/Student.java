package com.ustglobal.collectionframeworks;

public class Student {
	
	private final int id;
	private final String name;
	private final double rollNo;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getRollNo() {
		return rollNo;
	}
	public Student(int id, String name, double rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
}
