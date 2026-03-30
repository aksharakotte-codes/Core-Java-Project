package com.logicalstatements.forloops.examples;

public class PrintingStartPatternReverse {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
	       
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		System.out.println("Main Method Ended!!");

	}

}
