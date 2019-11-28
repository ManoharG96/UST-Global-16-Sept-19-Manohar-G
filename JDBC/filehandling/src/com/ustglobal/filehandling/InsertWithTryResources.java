package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithTryResources {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driverPath"));
			
			try(Connection con = DriverManager.getConnection(prop.getProperty("url"),prop);
					PreparedStatement stmt = con.prepareStatement("insertQuery");){
				
				stmt.setInt(1, Integer.parseInt(args[0]));
				stmt.setString(2, (args[1]));
				stmt.setInt(3, Integer.parseInt(args[2]));
				stmt.setString(4, (args[3]));
				
				int count = stmt.executeUpdate();
				System.out.println(count+ " Row(s) inserted");
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
