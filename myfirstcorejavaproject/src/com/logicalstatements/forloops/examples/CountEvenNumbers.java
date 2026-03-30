package com.logicalstatements.forloops.examples;
//Count even numbers (1–20)
public class CountEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		int count = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				count++;// 2 4 6 8 10 12 14 16 18 20 --> 10 even numbers
			}
		}
		
		System.out.println("Count of even numbers from 1 to 20: " + count);
		System.out.println("Main Method Ended!!");
	}
}