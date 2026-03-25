package com.logicalstatements;
//Nested if else Example
import java.util.Scanner;

public class TestLSNestedIfDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age..");
		int age = sc.nextInt();
		
		System.out.println("Do you have License..?");
		boolean hasLicense = sc.nextBoolean();
		
		if(age > 18) {
			
			if(hasLicense) {
				System.out.println("Are you Indian : ");
				boolean areYouIndian = sc.nextBoolean();
				
				if(areYouIndian) {
					System.out.println("Yes!!You are Eligible for Driving");
				} else {
					System.out.println("You age & license is good but you don't have citizenship so not Eligible for Driving ");
				}
				
			} else {
			    System.out.println("You age is Okay for Driving but, you don't have License");
			}
			
		} else {
			System.out.println("You are not Eligible for Driving ");
		}
		
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
