package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteRunTimeInsertQuery {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url= "jdbc:mysql://localhost:3306/ust_db";
			con = DriverManager.getConnection(url,"root","root");
			
			String sql = " insert into employee_info values " + " (?,?,?,?) ";
			pstmt = con.prepareStatement(sql);
			
			String eId = args[0];
			int id = Integer.parseInt(eId);
			pstmt.setInt(1, id);
			
			String eName = args[1];
			pstmt.setString(2, eName);
			
			String eSalary = args[2];
			int sal = Integer.parseInt(eSalary);
			pstmt.setInt(3, sal);

			String eGender = args[3];
			pstmt.setString(4, eGender);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Rows inserted");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
