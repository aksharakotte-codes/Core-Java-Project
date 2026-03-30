package com.logicalstatements.forloops.examples;

public class PrintingStartPattern {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
	       
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		System.out.println("Main Method Ended!!");

	}

}
