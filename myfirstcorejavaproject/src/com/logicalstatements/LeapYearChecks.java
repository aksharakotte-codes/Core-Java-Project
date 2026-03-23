package com.logicalstatements;

import java.util.Scanner;

public class LeapYearChecks {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : " );
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					System.out.println("Its a Leap Year");
				} else {
					System.out.println("Its not a leap year");
				}
					
			} else {
				System.out.println("Its not a Leap Year");
			}
			
		} else {
			System.out.println("Its Not a Leap Year");
		}
		sc.close();
	}
}
