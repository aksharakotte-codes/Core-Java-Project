package com.logicalstatements.forloops.examples;

import java.util.Scanner;

public class PrintArmStrongNumber {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int n1 = n;
		int temp = n;
		int count = 0;
		int sum = 0;
		
		if(n == 0) {
			count = 1;
		} else {
			for(; n != 0; n /= 10) {
				count++;
			}
		}
		
		for(; n1 != 0; n1 /= 10) {
			int s = n1 % 10;
			sum = (int) (sum +  Math.pow(s, count));
		}
		
		if(sum == temp) {
			System.out.println("Armstrong Number ");
		} else {
			System.out.println("Not a ArmStrong Number");
		}
		
		sc.close();
		System.out.println("Main Method Ended");

	}

}
