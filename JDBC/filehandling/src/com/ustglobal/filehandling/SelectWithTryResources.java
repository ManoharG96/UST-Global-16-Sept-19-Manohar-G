package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driverPath"));

			try (Connection con = DriverManager.getConnection(prop.getProperty("url"),prop);
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(prop.getProperty("selectQuery"))){
				while (set.next()) {
					System.out.println("ID: "+set.getInt("eId"));
					System.out.println("Name: "+set.getString("eName"));
					System.out.println("Salary: "+set.getInt("eSalary"));
					System.out.println("Gender: "+set.getString("eGender"));
					System.out.println("");
				}
			}


		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
