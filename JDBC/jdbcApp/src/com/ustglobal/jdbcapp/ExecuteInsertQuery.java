package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url= "jdbc:mysql://localhost:3306/ust_db";
			con = DriverManager.getConnection(url,"root","root");
			
			stmt = con.createStatement();
			String sql = " insert into employee_info values " + " (10,'Raja',54200,'Male') ";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + " Rows inserted");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
