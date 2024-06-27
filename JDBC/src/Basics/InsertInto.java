package Basics;
import java.sql.*;
import java.text.*;
import java.time.*;

import javax.xml.crypto.Data;

public class InsertInto {

	public static void main(String[] args) {
		
		try {
			
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			String url = "jdbc:mysql://localhost:3306/learn";
			Connection con = DriverManager.getConnection(url,"root","1234");
			
			// create query insert into table values
			String q = "INSERT INTO student2(lastName,firstName,major) values (?,?,?)";
			
			//get PreparedStatement object prepareStatement and PrepparedStatement are different
			
			PreparedStatement pstmt = con.prepareStatement(q); // pass only once in this not in execute update if passed then it is create empty value table
			
//			Date date = new Date("");
//			java.sql.Date sqldate = new java.sql.Date(date.getTime());			
//			SimpleDateFormat sdf = new SimpleDateFormat("MMMM/dd/YY");
//			java.util.Date udate = sdf.parse("OCTOBER/10/03");
//			long l  = udate.getTime();
//			java.util.Date sdate = new java.sql.Date(l);
			
			
			// insert data using method setString() or setInteger(), setDate, setTime ...... check online
			pstmt.setString(1,"Balendra");
			pstmt.setString(2,"Bhavesh");
			pstmt.setString(3,"Dance");
//			pstmt.setDate(4,sdate);
			pstmt.executeUpdate();
			con.close();
			
	
		} catch(Exception con){
			con.printStackTrace();
		}
		
		
		
	}

}
