package com.ustglobal.jdbcapp;

import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//Step-1: Load the driver
			Class.forName(prop.getProperty("driverPath"));

			//Step-2: Get the connection
			String url=  prop.getProperty("url");
			con = DriverManager.getConnection(url,prop);
			
			//Step-3: Issue the SQL query
			stmt = con.createStatement();
			String sql = prop.getProperty("selectQuery");
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
		} catch (Exception e) {
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
