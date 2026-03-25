package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Grade :");
		
		char grade = sc.next().charAt(0);
		switch(grade) {
		case 'O' -> System.out.println("Extra-Ordinary");
		case 'A' -> System.out.println("Excellent");
		case 'B' -> System.out.println("Good");
		case 'C' -> System.out.println("Average");
		case 'D' -> System.out.println("Just Passed");
		default -> System.out.println("Failed");
		}
		
		sc.close();
	}

}
