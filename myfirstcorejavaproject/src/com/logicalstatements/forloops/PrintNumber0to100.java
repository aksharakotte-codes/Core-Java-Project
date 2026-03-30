package com.logicalstatements.forloops;

//WAP to print 0 to 100 numbers.?
public class PrintNumber0to100 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		i++ --> i = i + 1
//		Step-1 : i = 1
//		--------------REPEAT------------------
//		Step-2 : i < 5 condition check
//		Step-3 : statements execution inside the loop
//		Step-4 : increment 
//		--------------------------------------	
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello " + " " + i);
		}
		
		System.out.println("Printing Values from 0 to 99 :" );
		for (int i = 0; i < 100; i++) {
			System.out.print(i + " ");
		}
	}

}
