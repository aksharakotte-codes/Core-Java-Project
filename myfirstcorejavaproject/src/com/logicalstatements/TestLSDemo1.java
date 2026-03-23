package com.logicalstatements;

// if statements Example
import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Your age :" );
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("You are Eligible for Voting & Driving !!");
			System.out.println("Congratulations !!");
		} 
		
		sc.close();
	}

}
