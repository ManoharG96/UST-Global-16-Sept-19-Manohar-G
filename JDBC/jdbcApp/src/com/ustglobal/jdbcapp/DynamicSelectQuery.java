package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/ust_db?";
		String sql = "select * from employee_info where eId=?";
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			con = DriverManager.getConnection(url, "root", "root");
			pStmt = con.prepareStatement(sql);
			
			String eId = args[0];
			int Id = Integer.parseInt(eId);
			pStmt.setInt(1, Id);
			
			res = pStmt.executeQuery();
			
			if (res.next()) {
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
		finally {
			try {
				if(con != null) {
					con.close();
				}
				if (pStmt != null) {
					pStmt.close();
				}
				if(res != null) {
					res.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}

}
