package com.ustglobal.employeeWebApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.employeeWebApp.dto.EmployeeInfo;

public class EmployeeDaoJdbcImpl implements EmployeeDAO {

	private static final String URL = "jdbc:mysql://localhost:3306/ust_web_db";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String INSERT_QUERY = "insert into employee_info values(?,?,?,?)";
	private static final String UPDATE_QUERY = "update employee_info set password=? where id=?";
	private static final String SELECT_QUERY = "select * from employee_info where id=?";

	@Override
	public EmployeeInfo auth(int id, String password) {
		EmployeeInfo info = searchEmployee(id);
		if(info != null) {
			String pass = info.getPassword();
			if(pass.equals(password))
				return info;
			else
				return null;
		}
		return null;
	}

	@Override
	public EmployeeInfo searchEmployee(int id) {
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			PreparedStatement stmt = con.prepareStatement(SELECT_QUERY);
			stmt.setInt(1, id);
			ResultSet set = stmt.executeQuery();

			if (set.next()) {

				EmployeeInfo bean = new EmployeeInfo();
				bean.setId(set.getInt("id"));
				bean.setName(set.getString("name"));
				bean.setEmail(set.getString("email"));
				bean.setPassword(set.getString("password"));
				return bean;

			}else 
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		int count=0;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			PreparedStatement stmt = con.prepareStatement(UPDATE_QUERY);

			stmt.setString(1, password);
			stmt.setInt(2, id);
			count = stmt.executeUpdate();

			boolean check = count>0? true : false;
			return check;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean registerEmployee(EmployeeInfo info) {

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL,"root","root");
			PreparedStatement stmt = con.prepareStatement(INSERT_QUERY);

			stmt.setInt(1, info.getId());
			stmt.setString(2, info.getName());
			stmt.setString(3, info.getEmail());
			stmt.setString(4, info.getPassword());

			int count = stmt.executeUpdate();

			if (count>0)
				return true;
			else 
				return false;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
