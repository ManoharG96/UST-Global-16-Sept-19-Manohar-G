package com.ustglobal.empApp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empApp.dao.EmployeeDAO;
import com.ustglobal.empApp.dto.EmployeeBean;
import com.ustglobal.empApp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		EmployeeDAO dao = EmployeeManager.getEmployeeDAO();

		switch (ch) {

		case 1:

			List <EmployeeBean> result= dao.getAllEmployeeData();
			for (EmployeeBean bean : result) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Salary: "+bean.getSalary());
				System.out.println("Gender: "+bean.getGender());
				System.out.println();	
			}
			break;

		case 2:
			System.out.println("Enter the Employee Id, Name, Salary, Gender to insert the data");
			int insert = dao.insertEmployeeData(scn.nextInt(), scn.next(), scn.nextInt(), scn.next());
			System.out.println(insert+ " Row(s) insert");
			break;

		case 3:
			System.out.println("Enter the employee name, salary, gender and employee id to be update");
			int update = dao.updateEmplyoeeData(scn.next(),scn.nextInt(),scn.next(),scn.nextInt());
			System.out.println(update+ "Row(s) updated");
			break;

		case 4:
			System.out.println("Enter the employee id to be deleted");
			int delete = dao.deleteEmployeeData(scn.nextInt());
			System.out.println(delete+ "Row(s) deleted");
			break;

		case 5:
			System.out.println("Enter the employee id");
			EmployeeBean bean = dao.searchEmployeeData(scn.nextInt());

			if (bean != null) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Salary: "+bean.getSalary());
				System.out.println("Gender: "+bean.getGender());
				System.out.println();

			}else
				System.out.println("no data found");
			break;
		}
		try {
			if (scn!= null)
				scn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
