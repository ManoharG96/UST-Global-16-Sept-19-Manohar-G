package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url= "jdbc:mysql://localhost:3306/ust_db";
			con = DriverManager.getConnection(url,"root","root");
			
			stmt = con.createStatement();
			String sql = "delete from employee_info where eid=10";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + " Rows deleted");
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
