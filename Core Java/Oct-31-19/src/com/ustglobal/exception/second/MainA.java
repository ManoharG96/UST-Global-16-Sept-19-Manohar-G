package com.ustglobal.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class MainA {

	public static void main(String[] args) {
		FileTest ft = new FileTest();
		try {
			try {
				try {
					ft.open();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("ClassNotFound exception is handled");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception is handled in the main method");
		} 
	}
}
