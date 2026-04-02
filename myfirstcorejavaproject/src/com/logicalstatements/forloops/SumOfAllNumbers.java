package com.logicalstatements.forloops;

//WAP to print the sum of all the numbers using for loop 
//like print sum of first 10 numbers..?
public class SumOfAllNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;//0+1=1, 1+2=3-- so on 45+10= 55
		}
		
		System.out.println("Sum of all Numbers : " + sum);
		System.out.println("Main Method Ended");
	}

}
