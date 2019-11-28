package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithTextFile {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_db";
		String sql = "insert into employee_info values (?,?,?,?)";
		
		try(FileReader in = new FileReader("text.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection con = DriverManager.getConnection(url, "root", "root");
				PreparedStatement stmt = con.prepareStatement(sql)) {
			
			while (reader.ready()) {
				String line = reader.readLine();
				String[] datas = line.split(",");
				
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int sal = Integer.parseInt(datas[2]);
				String gen = datas[3];
				
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setInt(3, sal);
				stmt.setString(4, gen);
				
				stmt.addBatch();
			}
			int[] counts = stmt.executeBatch();
			System.out.println(counts.length + " Row(s) Updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
