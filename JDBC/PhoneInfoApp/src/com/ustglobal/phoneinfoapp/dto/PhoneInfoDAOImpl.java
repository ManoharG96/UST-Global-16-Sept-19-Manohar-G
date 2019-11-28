package com.ustglobal.phoneinfoapp.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.ustglobal.phoneinfoapp.dao.PhoneInfoBean;

public class PhoneInfoDAOImpl implements PhoneInfoDAO {

	private final String URL = "jdbc:mysql://localhost:3306/ContactFile";
	private final String DRIVERPATH = "com.mysql.jdbc.Driver";
	private final String SELECTQUERY = "select * from Contact";
	private final String UPDATEQUERY = "update Contact set Number=?, Group=? where Name=?";
	private final String DELETEQUERY = "delete from Contact where Name=?";
	private final String SEARCHQUERY = "select * from Contact where name=?";
	private final String INSERTQUERY = "insert into contact values(?,?,?)";
	@Override
	public ArrayList<PhoneInfoBean> getContactInfo() {
		ArrayList< PhoneInfoBean> result = new ArrayList<PhoneInfoBean>();
		try {
			
			Class.forName(DRIVERPATH);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(SELECTQUERY);

			while (set.next()) {
				PhoneInfoBean bean = new PhoneInfoBean();
				bean.setName(set.getString("Name"));
				bean.setNumber(set.getDouble("Number"));
				bean.setGroup(set.getString("Group"));
				result.add(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	@Override
	public int insertContactInfo(String name, double number, String group) {
		int count = 0;
		try {
			Class.forName(DRIVERPATH);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			PreparedStatement stmt = con.prepareStatement(INSERTQUERY);

			stmt.setString(1, name);
			stmt.setDouble(2, number);
			stmt.setString(3, group);
			

			count =stmt.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public int updateContactInfo(double number, String group, String name) {
		int count=0;
		try {
			Class.forName(DRIVERPATH);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			PreparedStatement stmt = con.prepareStatement(UPDATEQUERY);

			stmt.setDouble(1, number);
			stmt.setString(2, group);
			stmt.setString(3, name);

			count = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public PhoneInfoBean serachContactinfo(String name) {

		try {
			Class.forName(DRIVERPATH);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			PreparedStatement stmt = con.prepareStatement(SEARCHQUERY);
			stmt.setString(1, name);
			ResultSet set = stmt.executeQuery();

			PhoneInfoBean bean = new PhoneInfoBean();

			if (set.next()) {
				bean.setName(set.getString("Name"));
				bean.setNumber(set.getDouble("Number"));
				bean.setGroup(set.getString("Group"));
				return bean;
			}else 
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public int deleteContactInfo(String name) {
		int count = 0;
		try {
			Class.forName(DRIVERPATH);
			Connection con = DriverManager.getConnection(URL, "root", "root");
			PreparedStatement stmt = con.prepareStatement(DELETEQUERY);

			stmt.setString(1, name);
			count = stmt.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
