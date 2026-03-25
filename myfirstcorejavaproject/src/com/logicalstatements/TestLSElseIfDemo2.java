package com.logicalstatements;
//if-else if-else Ladder (or) else-if Statement Example
import java.util.Scanner;

public class TestLSElseIfDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		
		if (age >= 60 ) {
		    System.out.println("You are a Senior Citizen");
		} else if (age >= 36) {
		    System.out.println("You are a Middle age");
		} else if (age >= 20) {
		    System.out.println("You are a Young");
		} else if (age >= 13) {
			System.out.println("You are a Teen");
		} else if (age >= 6) {
			System.out.println("You are a Kid");
		} else if (age >= 6) {
			System.out.println("You are a Child");
		} else {
		    System.out.println("Invalid Age!!");
		}
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
