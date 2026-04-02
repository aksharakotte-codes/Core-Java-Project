package com.logicalstatements.forloops;
//WAP to find the factorial of a given number using for loop..?
import java.util.Scanner;

public class PrintFactorial2 {
	static int findFactorial(int n) {
		int fact = 1;
		
		for(int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		int fact = findFactorial(n);
		System.out.println("Factorial of Given Number is : " + fact);
		
		sc.close();
		System.out.println("Main Method ended");
		

	}

}
