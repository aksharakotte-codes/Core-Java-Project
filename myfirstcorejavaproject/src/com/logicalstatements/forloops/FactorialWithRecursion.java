package com.logicalstatements.forloops;

//WAP to find the factorial of a given number using recursion..?
import java.util.Scanner;

public class FactorialWithRecursion {
	
	static int findFact(int n) {
		if(n == 1) {
			return 1;
		}
		return n * findFact(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int fact = findFact(n);
		System.out.println("Factorial of Given Number using recursion :" + fact);
		
		sc.close();
		System.out.println("Main Method Ended");

	}

}
