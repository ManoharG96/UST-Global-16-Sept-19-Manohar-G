package com.ustglobal.empApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ustglobal.empApp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	private String url = "jdbc:mysql://localhost:3306/ust_db";

	public ArrayList<EmployeeBean> getAllEmployeeData() {

		String sql = "select * from employee_info";
		ArrayList< EmployeeBean> result = new ArrayList<EmployeeBean>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(sql);

			while (set.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(set.getInt("eId"));
				bean.setName(set.getString("eName"));
				bean.setGender(set.getString("eGender"));
				bean.setSalary(set.getInt("eSalary"));
				result.add(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	public EmployeeBean searchEmployeeData(int id) {

		String sql = "select * from employee_info where eId=?";
		EmployeeBean bean = new EmployeeBean();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet set = stmt.executeQuery();

			if (set.next()) {
				bean.setId(set.getInt("eId"));
				bean.setName(set.getString("eName"));
				bean.setGender(set.getString("eGender"));
				bean.setSalary(set.getInt("eSalary"));	
			}else 
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return bean;
	}

	public int insertEmployeeData(int id, String name, int salary, String gender) {
		int count = 0;
		String sql = "insert into employee_info values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, salary);
			stmt.setString(4, gender);

			count =stmt.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int deleteEmployeeData(int id){
		int count = 0;
		String sql = "delete from employee_info where eid=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, id);
			count = stmt.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int updateEmplyoeeData(String name, double salary, String gender, int id ) {
		int count=0;
		String sql = "update employee_info set eName=?,eSalary=?, eGender=? where eId=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, name);
			stmt.setDouble(2, salary);
			stmt.setString(3, gender);
			stmt.setInt(4, id);
			count = stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
