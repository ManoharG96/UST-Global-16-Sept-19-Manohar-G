package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			//Step-1: Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step-2: Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_db";
			con = DriverManager.getConnection(url, "root", "root");//username and password is given as parameter

			//Step-3: Issue the SQL query
			stmt = con.createStatement();
			String sql = "select * from employee_info";
			res = stmt.executeQuery(sql);//ResultSet is a table representation in Java

			//Step-4: Read the result
			while (res.next()) {

				int id = res.getInt("eID");
				String name = res.getString("eName");
				double sal = res.getInt("eSalary");
				String gen = res.getString("eGender");

				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gen);
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		//Step-5: Close all the JDBC Objects
		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (res != null) {
					res.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	Connection con = null;
	Statement stmt = null;
	ResultSet res = null;
	{
		try {
			//Step-1: Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step-2: Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_db";
			con = DriverManager.getConnection(url, "root", "root");//username and password is given as parameter

			//Step-3: Issue the SQL query
			stmt = con.createStatement();
			String sql = "select * from employee_info";
			res = stmt.executeQuery(sql);//ResultSet is a table representation in Java

			//Step-4: Read the result
			while (res.next()) {

				int id = res.getInt("eID");
				String name = res.getString("eName");
				double sal = res.getInt("eSalary");
				String gen = res.getString("eGender");

				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gen);
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		//Step-5: Close all the JDBC Objects
		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (res != null) {
					res.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
