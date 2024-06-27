package Basics;
import java.sql.*;
import java.text.*;

public class InsertJDBC {

	public static void main(String[] args) {
		
		try {
			
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			String url = "jdbc:mysql://localhost:3306/learn";
			Connection con = DriverManager.getConnection(url,"root","1234");
			
			// create query
			String q = "CREATE TABLE student2 (lastName VARCHAR(20), firstName VARCHAR(20),major VARCHAR(20), bDay DATE);";
			
			// create statement
			Statement stmt = con.createStatement();
			
			//use update instead of query 
			
			stmt.executeUpdate(q);
			
			System.out.println("Table created in database");
			
			con.close();
			
		} catch(Exception con){
			con.printStackTrace();
		}
		
		
		
	}

}
