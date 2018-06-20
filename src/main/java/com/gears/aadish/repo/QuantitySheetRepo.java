package com.gears.aadish.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;

public class QuantitySheetRepo {

	
	static Connection getConncetion(){		
		Connection con = null;		
		return con;
	}
	
	public void saveJobDetails(String jobId, String jobName, int quantity,
			Date actualInDate, Date expectedOutDate) {
		System.out.println("I am in saveJobDetails");
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mms","root","root");  
			//here mms is database name, root is username and password
			
		    java.sql.Date actualsqlDate = new java.sql.Date(actualInDate.getTime());
		    java.sql.Date expectedOutSqlDate = new java.sql.Date(expectedOutDate.getTime());
			String query = " insert into invardquantity (idinvardquantity,jobId,jobName, quantity,actualInDate,expectedOutDate)"
			        + " values (?,?,?,?,?,?)";
			java.sql.PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, "111337731");
			stmt.setString(2, jobId);
			stmt.setString(3, jobName);
			stmt.setInt(4, quantity);	
			stmt.setDate(5, actualsqlDate);
			stmt.setDate(6, actualsqlDate);			
			stmt.execute();
			ResultSet rs = null;
			//ResultSet rs=stmt.executeQuery("select * from invardquantity");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close(); 
		}catch(Exception e){
			System.out.println(e);	
		}			 
		
	}	
	
}
