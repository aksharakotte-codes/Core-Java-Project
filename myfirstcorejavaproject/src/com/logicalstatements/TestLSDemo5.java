package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
//		With Curly brackets
		if(num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		
//		Without curly brackets
//		if(num % 2 == 0) 
//			System.out.println("Even Number");
////		    System.out.println("Yess !!! It's a Even (Statement-2)");
////		Here if we write statement 2 the else statement gives an syntax error
////		So better to use brackets everywhere
//	    else 
//			System.out.println("Odd Number");
//		    System.out.println("Yess !!! It's a Odd");
//		
		sc.close();

	}

}
