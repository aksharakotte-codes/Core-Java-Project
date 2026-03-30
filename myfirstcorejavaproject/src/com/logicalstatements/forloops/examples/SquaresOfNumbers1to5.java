package com.logicalstatements.forloops.examples;

public class SquaresOfNumbers1to5 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
//        Method - 1:
//			for(int i = 1; i <= 5; i++) {
//				System.out.println("Square of " + i + " = " +  i * i);
//		    }
		
		for(int i = 1; i <= 5; i++) {
			int square = i * i;
			System.out.println("Square of " + i + " = " + square);
	    }
		
		System.out.println("Main Method ended!!");


	}

}
