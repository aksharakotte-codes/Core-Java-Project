package com.logicalstatements.forloops;

//WAP to print whether it is prime or not..?
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Main method Started"); 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number : "); 
		int n = sc.nextInt(); 
		
		boolean status = true; 
		if(n == 0 || n == 1) {
    		status = false;
    	}
    	
		
		for(int i =2; i <= n/2; i++) { 
			if(n % i == 0 ) {
			   status =  false;
			   break;
			}
		} 
		
		if(status == true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
		
		sc.close();
		System.out.println("Main method Ended");
	}

}
