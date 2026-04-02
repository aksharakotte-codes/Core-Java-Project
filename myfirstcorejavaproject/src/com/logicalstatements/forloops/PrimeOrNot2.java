package com.logicalstatements.forloops;

import java.util.Scanner;

public class PrimeOrNot2 {
	 static boolean isPrime(int n) {
		 boolean status = true;
		 
		 if(n == 0 || n == 1) {
	    		status = false;
	     }
	    	
		 for(int i = 2; i <= n/2; i++) {
			 if(n % 2 == 0) {
				 status = false;
				 break;
			 }
		 }
		 if(status) {
			 System.out.println("Prime Number");
		 } else {
			 System.out.println("Not a Prime Number ");
		 }
		 return status;
	 }
	public static void main(String[] args) {
		System.out.println("main method started!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
	    isPrime(n);
		
	    sc.close();
		System.out.println("main method Ended!");

	}

}
