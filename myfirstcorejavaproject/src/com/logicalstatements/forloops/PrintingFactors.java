package com.logicalstatements.forloops;

import java.util.Scanner;

//WAP to printing factors for given numbers using for loop
// input : 6
// Factors of 6 : 1 2 3 6 --> 1 + 2 + 3 = 6 (perfect number)
//Perfect Number : The given number is equals to the sum of its factors but not itself
//
// input : 9
// Factors of 9 : 1 3 9
//
// input : 24
// Factors of 6 : 1 2 3 4 6 8 12 24
//
// input : 24
// Factors of 6 : 1 2 4 7 14 28 --> 1 + 2 + 4 + 7 + 14 = 28
public class PrintingFactors {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Factors of Given Number : ");
		for(int i = 1; i <= n/2; i++) {
//			1) 6 (6
//			   6
//			  -------
//			   0
//			2) 6 (3
//			   6
//			  -------
//			   0 
//			
//			3) 6 (2
//			   6
//			  -------
//			   0  where n = 6 and n/2 = 3 after n/2 numbers are not possible to become for any number
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
		sc.close();
		System.out.println("Main Method ended!!");
	}

}
