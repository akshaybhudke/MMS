package com.gears.aadish.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuantitySheetRepo {

	
	static Connection getConncetion(){		
		Connection con = null;
		
		return con;
	}
	
	
	public void saveJobDetails() throws SQLException {
		System.out.println("I am in saveJobDetails");
		Connection con = null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mms","root","root");  
			//here mms is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from invardquantity");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close(); 
		}catch(Exception e){
			System.out.println(e);	
		}		
		 
		
	}	
	
}
