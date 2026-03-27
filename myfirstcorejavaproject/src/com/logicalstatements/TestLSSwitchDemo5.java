package com.logicalstatements;

import java.util.Scanner;

public class TestLSSwitchDemo5 {
	
	static String getDayInfo(String day) {
		switch(day) {
		case "Monday" : 
			return "Lazy day";
		case "Tuesday", "Wednesday", "Thursday" : 
			return "Normal day";
		case "Friday" : 
			return "Weekend with Holidays";
		default : 
			return "Entered day is invalid";
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day : ");
		String day = sc.next();
		System.out.println(getDayInfo(day));
		
		sc.close();
		System.out.println("Main Method ended!!");

	}

}
