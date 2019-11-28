package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url= "jdbc:mysql://localhost:3306/ust_db";
			con = DriverManager.getConnection(url,"root","root");
			
			String sql = " update employee_info set eName=?, eSalary=?, eGender=? where eId=? ";
			pstmt = con.prepareStatement(sql);
			
			String gen = args[2];
			pstmt.setString(3, gen);
			
			 
			pstmt.setInt(4, Integer.parseInt(args[3]));
			
			String eName = args[0];
			pstmt.setString(1, eName);
			
			String eSalary = args[1];
			int sal = Integer.parseInt(eSalary);
			pstmt.setInt(2, sal);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Rows updated");
			
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
