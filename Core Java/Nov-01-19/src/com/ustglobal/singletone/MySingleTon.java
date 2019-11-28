package com.ustglobal.singletone;

public class MySingleTon {
	
	private static MySingleTon instance = new MySingleTon();
	
	private MySingleTon() {	
	}
	
	String s;
	
	public static MySingleTon getDbConnection() {
		return instance;
	}
}
