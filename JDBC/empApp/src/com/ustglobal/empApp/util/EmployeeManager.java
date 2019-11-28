package com.ustglobal.empApp.util;

import com.ustglobal.empApp.dao.EmployeeDAO;
import com.ustglobal.empApp.dao.EmployeeDAOImpl;

public class EmployeeManager {

	private EmployeeManager() {	
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();	
	}
	
}
