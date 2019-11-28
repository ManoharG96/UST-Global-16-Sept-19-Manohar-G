package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {

		String path = "text.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);

			String name = properties.getProperty("Name");
			String company= properties.getProperty("Company");
			String salary = properties.getProperty("Salary");
			String girlFriend = properties.getProperty("GirlFriend");

			System.out.println("Name: "+name);
			System.out.println("company: "+company);
			System.out.println("Salary: "+salary);
			System.out.println("GirlFriend: "+girlFriend);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
