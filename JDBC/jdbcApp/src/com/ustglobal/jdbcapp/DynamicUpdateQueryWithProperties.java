package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicUpdateQueryWithProperties {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverPath"));
			
			String url= prop.getProperty("url");
			con = DriverManager.getConnection(url, prop);
			
			String sql = prop.getProperty("updateQuery");
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
			
		}catch (Exception e) {
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
