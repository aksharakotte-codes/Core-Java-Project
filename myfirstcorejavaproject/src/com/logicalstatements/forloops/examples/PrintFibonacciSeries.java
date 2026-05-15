package com.logicalstatements.forloops.examples;

import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want to print ..?");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print(a + " " + b);// 0 1
		
		for(int i = 0; i < n - 2; i++) {
			c = a + b;// 0 + 1 = 1, 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3+ 5 = 8, 5 + 8 = 13 
			System.out.print(" " + c);// 1 2 3 5 8 13
			a = b;// 1 1 2 3 5
			b = c;// 1 2 3 5 8
		}
		
		
		sc.close();
		System.out.println("Main Method Ended !!");

	}

}
