package com.logicalstatements.forloops;
//WAP to printing sum for given numbers using for loop
public class PrintingSum {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		 int sum = 0;
		 
		 for (int i = 0; i <= 10; i++) {
			 sum = sum  + i;
		 }
		 System.out.println("Sum of Given Numbers is : " + sum);
	}

}
