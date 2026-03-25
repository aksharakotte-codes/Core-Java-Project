package com.logicalstatements;

import java.util.Scanner;

public class ExampleLoginNestedIf {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.nextLine();
		
		 if (username.equals("Akshara")) {
	            System.out.print("Enter password: ");
	            String pass = sc.nextLine();

	         if (pass.equals("1234")) {
	                System.out.println("Login Successful");
	                
	          } else {
	                System.out.println("Wrong Password");
	          }
	      } else {
	            System.out.println("User not found");
	        }
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
