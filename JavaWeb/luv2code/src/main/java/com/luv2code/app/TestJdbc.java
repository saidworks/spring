package com.luv2code.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {
	
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "saidlearns";
		String password = "mysql";
		try {
			Connection con = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("connection successful");
			
//			 Statement st = con.createStatement();
//			    ResultSet rs = st.executeQuery("show databases");
//
//			    //while (rs.next() == true) {
//			    System.out.println(rs.getString(0));
//			    //}
			
		    Statement stmt = con.createStatement();
		    /*------------------------*/

		    String createTable = "CREATE TABLE IF NOT EXISTS EMPLOYEE(" + "ID INT NOT NULL," + "NAME VARCHAR(200))";
		    stmt.executeUpdate(createTable);

		    String insertData = "INSERT INTO EMPLOYEE VALUES " + "(0,'luci')," + "(1,'Stan')," + "(2,'Faustus')";

		    System.out.println(stmt.executeUpdate(insertData));
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
