package com.ustglobal.maps;

public class Student {
	int id;
	String name;
	public double percent;
	public Student(int id, String name, double percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percent=" + percent + "]";
	}
	
}