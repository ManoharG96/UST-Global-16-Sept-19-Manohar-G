package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithTryResources {

	public static void main(String[] args) {
		try{
			FileReader reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driverPath"));

			try(Connection con = DriverManager.getConnection(prop.getProperty("url"),prop);
					PreparedStatement stmt = con.prepareStatement(prop.getProperty("updateQuery"))) {

				stmt.setString(1, (args[0]));
				stmt.setInt(2, Integer.parseInt(args[1]));
				stmt.setString(3, (args[2]));
				stmt.setInt(4, Integer.parseInt(args[3]));

				int count = stmt.executeUpdate();
				System.out.println(count+ "Row(s) Update");

			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


