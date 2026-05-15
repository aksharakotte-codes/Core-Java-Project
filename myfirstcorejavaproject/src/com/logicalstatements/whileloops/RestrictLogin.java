package com.logicalstatements.whileloops;

import java.util.Scanner;

//WAP to Restrict Login only for 3 attempts
public class RestrictLogin {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String username = "admin";
		String password = "admin#123";
		int attempts = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (attempts < 3) {
			System.out.println("Enter your Username :");
			String user = sc.next();
			
			System.out.println("Enter a Password : ");
			String pass = sc.next();
			
			if(user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("Login Succesfully !!");
				break;
			} else {
				System.out.println("Invalid User Credentials !!");
				attempts++;
			}
		}
		
		if(attempts==3) {
			System.err.println("Your account Locked for 24hrs!");
		}
		sc.close();
		System.out.println("Main Method Ended");

	}

}
