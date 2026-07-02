package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo11 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username :");
		String username = sc.next();
		
		System.out.println("Enter your password :");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("admin") && password.equals("Admin@123")) {
			System.out.println("Weclome to the Login page");
		} else {
			System.err.println("Something Went Wrong or Invalid Credentials");
		}
		
		sc.close();
		System.out.println("Main Method Ended");
	}

}
