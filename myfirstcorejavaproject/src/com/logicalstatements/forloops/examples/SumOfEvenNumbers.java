package com.logicalstatements.forloops.examples;
//WAP to Sum of even numbers (1–10)
public class SumOfEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				 sum = sum + i;//30 --> 2 + 4 + 6 + 8 + 10
			}
		}
		System.out.println("Sum of Numbers from 1 to 5 : " + sum);
		System.out.println("Main Method ended!!");

	}

}
