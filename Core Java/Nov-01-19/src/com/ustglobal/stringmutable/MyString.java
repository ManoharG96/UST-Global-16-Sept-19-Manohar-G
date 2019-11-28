package com.ustglobal.stringmutable;

public final class MyString {
	private final int rollNo;
	private final String name;
	
	public MyString(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}	
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}

	public MyString changeContent(int rollNo, String name) {
		MyString m = new MyString(rollNo, name);
		return m;
	}

	@Override
	public String toString() {
		return "MyString [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
