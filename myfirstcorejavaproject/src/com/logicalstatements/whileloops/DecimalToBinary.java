package com.logicalstatements.whileloops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int r = 0;
		String rev = " ";
		
		while(n != 0) {
			r = n % 2;
			n = n /2;
			rev = r + rev;
		}
		
		System.out.println("Decimal to Binary is : " + rev + " ");
		sc.close();
		System.out.println("Main Method Ended");
		

	}

}
