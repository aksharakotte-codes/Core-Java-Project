package com.logicalstatements.forloops.examples;

public class SumOfNumbers1to5 {

	public static void main(String[] args) {
        System.out.println("Main Method started!!");
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
		    sum = sum + i;// 1 -> 3 -> 6 -> 10 -> 15 --> total = 15
		 
		}
		System.out.println("Sum of Numbers from 1 to 5 : " + sum);
		System.out.println("Main Method ended!!");

	}

}
