package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 -> System.out.println("January"); 
		case 2 -> System.out.println("Feburary");
		case 3 -> System.out.println("March");
		case 4 -> System.out.println("April");
		case 5 -> System.out.println("May"); 
		case 6 -> System.out.println("June"); 
		case 7 -> System.out.println("July");
		case 8 -> System.out.println("August");
		case 9 -> System.out.println("September");
		case 10 -> System.out.println("October");
		case 11-> System.out.println("November"); 
		case 12 -> System.out.println("December"); 
		default -> System.out.println("Entered Month is not available");
		
		}
		sc.close();
		
		System.out.println("Main Method Ended!!");

	}

}
