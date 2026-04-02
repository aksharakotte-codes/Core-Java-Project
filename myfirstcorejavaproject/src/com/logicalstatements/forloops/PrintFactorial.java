package com.logicalstatements.forloops;

import java.util.Scanner;

//WAP to find the factorial of a given number using for loop..?
//Input : 4
//Output : 4! --> 4 * 3 * 2 * 1 --> 24
public class PrintFactorial {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();//4
		
		for(int i = n; i >= 1; i--) {
			fact = fact * i;//4 * 3 * 2 * 1 --> 24
		}
        System.out.println("Factorial of a given number is : " + fact);
        sc.close();
	}

}
