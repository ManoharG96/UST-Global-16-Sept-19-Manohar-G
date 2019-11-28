package com.ustglobal.springmvc.beans;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private int id;
	private String name;
	private String gender;
	private String password;
	private Date doj;
	
}
