package com.logicalstatements;

import java.util.Scanner;

//WAP for a single Java program which can provide the possibilities 
//for Marriage matrimony Console based Application 
public class TestLSNestedIfDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		System.out.println("Welcome to Vcube Matrimonial Website Application");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell about Your name : ");
		String name = sc.nextLine();
		System.out.println("Hello Mr. " + name);
		
		System.out.println("Can you tell ,How much assets you have..?");
		double assets =sc.nextDouble();
		System.out.println("Enter your salary info : ");
		double salary = sc.nextDouble();
		
		if(assets >= 50000000.00 && salary >= 2500000.00) {
			System.out.println("Yes !! Then we can start the conversation ");
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			if(age <= 28 && age >= 26) {
				System.out.println("Oh okay!! shall we proceed further");
				
				System.out.println("Can you enter your Weight ..?");
				double weight = sc.nextDouble();
				
				if(weight <= 75 && weight >= 65) {
					System.out.println("Okay cool!! Let's enter your Height");
					
					float height = sc.nextFloat();
					if(height >= 5.4 && height <= 6.0) {
						System.out.println("Okay Good to go !!");
						
						System.out.println("Do you have sibilings!!");
						boolean sibStatus = sc.nextBoolean();
						if (!sibStatus) {
							System.out.println("Okaay!! We wil come back to you soon");
						} else {
							System.out.println("OMG!!!!!!!!!!!!!!");
						}
						
					} else {
						System.out.println("Your height is too long or short");
					}
					
				} else {
					System.out.println("You must join in gym!!");
				}
				
			} else {
				System.out.println("Sorry!! Your age is not matching with the profile");
			}
			
		} else {
			System.out.println("You can leave for the day!! All the best");
		}
		
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
