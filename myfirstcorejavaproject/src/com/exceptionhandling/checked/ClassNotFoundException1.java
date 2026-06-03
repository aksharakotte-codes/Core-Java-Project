package com.exceptionhandling.checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassNotFoundException1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println("Main Method Started");
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
//        	Loading the Driver
//    		Return the Class object associated with the class or interface with the class or interface with the given string name
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Driver class has been loaded successfully !");
    		
//    		Attempts to establish a connection to the given database URL.
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
    		System.out.println("Connection Established !");
    		
//    		Creates a Statement object for sending SQL statements to the database
    		st = con.createStatement(); 
//    		
    		String sql = "select * from student";
//    		Executes the given SQL statement, which returns a single ResultSet object.
    		rs = st.executeQuery(sql);
    		while(rs .next()) {
    			System.out.println(rs.getInt(1));
    			System.out.println(rs.getString(2));
    			System.out.println(rs.getString(3));
    			System.out.println(rs.getFloat(4));
    			System.out.println(rs.getString(5));
    			System.out.println(rs.getString(6));
    			System.out.println("************************");
    		}
	}

}
