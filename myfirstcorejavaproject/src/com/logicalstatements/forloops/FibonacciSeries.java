package com.logicalstatements.forloops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want to print...?");
		int n = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
	    System.out.print(n1 + " " + n2);
		
		for(int i = 0; i < n-2; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
		sc.close();
		System.out.println("Main Method Ended");

	}

}
