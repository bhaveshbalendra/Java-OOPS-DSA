package com.bhavesh;

import java.sql.*;


public class FirstJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db_demo";
			String username = "root";
			String password = "abcd";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			if (con.isClosed()) {
				System.out.println("Connection is Closed");
			}
			else {
				System.out.println("Connection is Sucessfully Connected");
				 
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
