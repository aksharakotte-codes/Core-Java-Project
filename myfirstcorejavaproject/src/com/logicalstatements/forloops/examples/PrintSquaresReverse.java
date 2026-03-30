package com.logicalstatements.forloops.examples;
//Print squares in reverse(5 to 1)
public class PrintSquaresReverse {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		for(int i = 5; i > 0; i--) {
			int squares = i * i ;
			System.out.println("Square of " + i + " = " + squares);
	    }
		
		System.out.println("Main Method ended!!");
	}

}
