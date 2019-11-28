package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicDeleteQuery {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement stmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driverPath"));
			String url= prop.getProperty("url");
			con = DriverManager.getConnection(url,prop);

			stmt = con.prepareStatement(prop.getProperty("deleteQuery"));

			String eId = args[0];
			int id = Integer.parseInt(eId);
			stmt.setInt(1, id);

			int count = stmt.executeUpdate();
			System.out.println(count + " Rows deleted");
			
		}catch (Exception e) {
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
