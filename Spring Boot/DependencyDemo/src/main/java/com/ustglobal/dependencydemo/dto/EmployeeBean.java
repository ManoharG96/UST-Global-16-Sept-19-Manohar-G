package com.ustglobal.dependencydemo.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeBean {

	private int eid;
	private String ename;
	private String egender;
	private String email;
	private String epassword;
	@Autowired
	private DepartmentBean ddetails;
	
	public void display() {
		System.out.println("Employee Object is Created");
		System.out.println(ddetails.disp());
	}
	
}