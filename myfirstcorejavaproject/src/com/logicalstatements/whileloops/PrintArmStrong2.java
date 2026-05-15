package com.logicalstatements.whileloops; 

import java.util.Scanner; 

public class PrintArmStrong2 { 
	public static void main(String[] args) { 
		System.out.println("Main Method started!!"); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();//153 
		int temp = n; 
		int r = 0;
		int sum = 0;
		
		String s = Integer.toString(n); 
		int count = s.length(); 
		while(n != 0) {
			r = n % 10;//3 5 1 
			n = n / 10;//15 5 1 
			sum = (int) (sum + Math.pow(r, count));
		}
			if (sum == temp) { 
				System.out.println("The Given Number is Armstrong number "); 
			} else {
				System.out.println("The Given Number is not a Armstrong"); 
			}
			sc.close(); 
			System.out.println("Main Method ended!!");
	}
}