package com.logicalstatements.forloops;

import java.util.Scanner;

public class PrintingFactors2 {
	
	static void findFactors(int n) {
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println(i + "");
			}
		}
		System.out.println(n + "");
	}

	public static void main(String[] args) {
        System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Factors of Given Number : ");
		findFactors(n);
		sc.close();

	}

}
