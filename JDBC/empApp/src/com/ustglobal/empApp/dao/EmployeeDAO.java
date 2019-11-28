package com.ustglobal.empApp.dao;

import java.util.ArrayList;
import com.ustglobal.empApp.dto.EmployeeBean;

public interface EmployeeDAO {
	
	public ArrayList<EmployeeBean> getAllEmployeeData();
	
	public int insertEmployeeData(int id, String name, int salary, String gender);
	public int deleteEmployeeData(int id);
	public EmployeeBean searchEmployeeData(int id);
	public int updateEmplyoeeData(String name, double salary, String gender, int id);
	
}
