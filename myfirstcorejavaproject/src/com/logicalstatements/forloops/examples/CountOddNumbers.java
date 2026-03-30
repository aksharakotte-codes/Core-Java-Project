package com.logicalstatements.forloops.examples;
//Count odd numbers (1–20)
public class CountOddNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		int count = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 1) {
				count++;// 1 3 5 7 9 11 13 15 17 19 --> 10 odd numbers
			}
		}
		
		System.out.println("Count of odd numbers from 1 to 20: " + count);
		System.out.println("Main Method Ended!!");
	}
}