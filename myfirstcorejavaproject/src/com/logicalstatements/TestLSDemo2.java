package com.logicalstatements;

// if else statements Example 
import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Your age :" );
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("Your Eligible for Voting & Driving !!");
			System.out.println("Congratulations !!");
		} else {
			System.out.println("Your are not Eligible");
		}
		
		sc.close();
	}

}
