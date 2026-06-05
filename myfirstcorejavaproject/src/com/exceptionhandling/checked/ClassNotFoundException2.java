package com.exceptionhandling.checked;

//WAP to get all the data from the database and display it in console
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassNotFoundException2 {

	public static void main(String[] args) throws SQLException {
		System.out.println("Main Method Started");
		
		try {
//		Loading the Driver
//		Return the Class object associated with the class or interface with the class or interface with the given string name
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class has been loaded successfully !");
		} catch (ClassNotFoundException c) {
			System.err.println("Exception in Catch");
		}
//		Attempts to establish a connection to the given database URL.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		System.out.println("Connection Established Successfully!");
		
//		Creates a Statement object for sending SQL statements to the database
		Statement st = con.createStatement(); 
//		
		String sql = "select * from student";
//		Executes the given SQL statement, which returns a single ResultSet object.
		ResultSet rs = st.executeQuery(sql);
		
//		Moves the cursor forward one row  from its current position.
		while(rs .next()) { 
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getFloat(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			System.out.println("************************");
		}
		
//		Close the Connection
		con.close();
		System.out.println("Main Method Ended");
}

}
