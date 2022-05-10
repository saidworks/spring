package com.luv2code.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "saidlearns";
		String password = "mysql";
		try {
			Connection con = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("connection successful");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
