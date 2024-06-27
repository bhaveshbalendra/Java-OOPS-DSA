package com.bhavesh;
import java.sql.*;
public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db_demo";
			String username = "root";
			String password = "abcd";
			Connection con = DriverManager.getConnection(url,username,password);
			String q = "create table table1(tID INT(20) primary key auto_increment, tName varchar(100), tCity varchar(200))";
			
			Statement statement = con.createStatement();
			statement.executeUpdate(q);
			System.out.println("Query execuated");
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	



















