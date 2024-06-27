package com.bhavesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class DynamicReading {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db_demo";
			String username = "root";
			String password = "abcd";
			Connection con = DriverManager.getConnection(url,username,password);
			String q = "insert into table1(tName,tCity) values (?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the name : ");
			String name = br.readLine();
			
			System.out.println("Enter the city : ");
			String city = br.readLine();
			pstmt.setString(1,name );
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			System.out.println("inserted>>>>>");
			con.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
