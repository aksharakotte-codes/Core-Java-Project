package com.logicalstatements.forloops;

//WAP to find the factorial of a given number using recursion..?
import java.util.Scanner;

public class FactorialWithRecursion2 {
	
	static long findFact(long n) {
		if(n == 1) {
			return 1;
		}
		return n * findFact(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		long n = sc.nextInt();
		long fact = findFact(n);
		System.out.println("Factorial of Given Number using recursion :" + fact);
		
//		Enter a number :
//		66
//		Factorial of Given Number using recursion :0
//	Enter a number :
//		65
//		Factorial of Given Number using recursion :-9223372036854775808
//	Upto 65 digits only gives values in long after that it will give 0
		
		sc.close();
		System.out.println("Main Method Ended");

	}

}
