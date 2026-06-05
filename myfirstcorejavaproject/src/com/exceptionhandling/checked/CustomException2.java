package com.exceptionhandling.checked;

import java.util.Scanner;

public class CustomException2 {
	
	static void hello() throws InterruptedException {
		System.out.println("Hello");
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws CustomException, InterruptedException {
		System.out.println("Main Method Started");
		
		hello();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age : ");
		int age = sc.nextInt();
		
		if (age < 18) {
			throw new CustomException("Arey Babu nik inka time undi ra");
		} else {
			System.out.println("You are Eligible for Voting and Driving");
			System.out.println("You are Eligible for Dhurandhar movie 2");
		}
		
		sc.close();
		
		System.out.println("Main Method Ended");

	}

}
