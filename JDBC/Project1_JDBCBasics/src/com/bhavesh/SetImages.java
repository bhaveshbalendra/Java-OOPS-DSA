package com.bhavesh;

import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SetImages {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_demo";
		String username = "root";
		String password = "abcd";
		Connection con = DriverManager.getConnection(url,username,password);
		
		String q = ("insert into image(pic) values(?)");
		PreparedStatement pstmt = con.prepareStatement(q);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\bhojr\\OneDrive\\Desktop\\download.jpeg");
		
		pstmt.setBinaryStream(1, fis, fis.available());
		pstmt.executeUpdate();
		System.out.println("Inserted....");
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
