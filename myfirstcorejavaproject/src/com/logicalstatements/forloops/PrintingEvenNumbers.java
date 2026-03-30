package com.logicalstatements.forloops;
//WAP to printing even for given numbers using for loop
public class PrintingEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0 && i!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("Main Method ended!!");
	}

}
