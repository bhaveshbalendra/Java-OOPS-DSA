package com.bhavesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Prepared1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db_demo";
			String username = "root";
			String password = "abcd";
			Connection con = DriverManager.getConnection(url,username,password);
			String q = "insert into table1(tName,tCity) values (?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, "rami");
			pstmt.setString(2, "raipur");
			
			pstmt.executeUpdate();
			System.out.println("inserted>>>>>");
			con.close();
		}
		catch (Exception e) {
			System.out.println("Error");
//			e.printStackTrace();
		}
	}

}
