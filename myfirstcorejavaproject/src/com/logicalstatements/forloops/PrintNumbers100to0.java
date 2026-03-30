package com.logicalstatements.forloops;

//WAP to print 100 to 0 numbers.?
public class PrintNumbers100to0 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		i-- --> i = i - 1
//		Step-1 : i = 1
//		--------------REPEAT------------------
//		Step-2 : i > 0 condition check
//		Step-3 : statements execution inside the loop
//		Step-4 : decrement
//		--------------REPEAT------------------		
		for (int i = 4; i > 0; i--) {
			System.out.println("Hello " + " " + i);
		}
		
		System.out.println("Printing Values from 100 to 0 :" );
		for (int i =100; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
