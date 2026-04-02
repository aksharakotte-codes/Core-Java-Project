package com.logicalstatements.forloops;

//WAP to print the prime numbers up to 100 numbers..?
public class PrintPrimeNumbers {
    static boolean isPrime(int n) {
    	
    	boolean status = true;
    	
    	
    	if(n == 0 || n == 1) {
    		status = false;
    	}
    	
    	for(int i = 2; i < n; i++) {
    		if(n % i == 0) {
    			status = false;
    			break; 	
    		}
    	}
    	
    	return status;
    	
    }
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		for(int i = 0; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("Main Method Ended!!");

	}
}
