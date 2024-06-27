package Basics;
import java.sql.*;
import java.lang.*;
import java.sql.Connection;

public class FirstJDBC {
	public static void main(String[] args) {
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			String url = "jdbc:mysql://localhost:3306/jdbcdb";
			Connection con = DriverManager.getConnection(url,"root","1234");
			
			if (con.isClosed()) {
				System.out.println("Connection is Closed");
			}else System.out.println("Connection is Connected");
			
					
		} catch (Exception e) {
			System.out.println("Exception!!!!!");
			e.printStackTrace();// TODO: handle exception
		}
	}	
}
