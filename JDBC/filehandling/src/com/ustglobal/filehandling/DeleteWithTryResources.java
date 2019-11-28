package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DeleteWithTryResources {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			try(Connection con = DriverManager.getConnection(prop.getProperty("url"),prop);
					PreparedStatement stmt = con.prepareStatement(prop.getProperty("deleteQuery"));){

				stmt.setInt(1, Integer.parseInt(args[0]));
				int count = stmt.executeUpdate();
				System.out.println(count+" Row(s) Deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
