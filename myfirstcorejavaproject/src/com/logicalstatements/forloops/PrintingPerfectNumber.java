package com.logicalstatements.forloops;
//WAP to printing factors for given numbers using for loop is perfect number or not

//Factors of 6 : 1 2 3 6 --> 1 + 2 + 3 = 6 (perfect number)
//Perfect Number : The given number is equals to the sum of its factors but not itself
import java.util.Scanner;

public class PrintingPerfectNumber {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == n) {
			System.out.println("The given Number is perfect number");
		} else {
			System.out.println("The given Number is not a perfect number");
		}
		
		
		sc.close();
		System.out.println("Main Method ended!!");
	}
}