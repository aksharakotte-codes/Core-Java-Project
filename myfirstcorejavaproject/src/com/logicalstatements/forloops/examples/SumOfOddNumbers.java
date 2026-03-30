package com.logicalstatements.forloops.examples;
//WAP to Sum of odd numbers (1–10)
public class SumOfOddNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				 sum = sum + i;//25 --> 1 + 3 + 5 + 7 + 9
			}
		}
		System.out.println("Sum of Numbers from 1 to 5 : " + sum);
		System.out.println("Main Method ended!!");
	}

}
