package com.logicalstatements.forloops;

import java.util.Scanner;

//WAP to check the given number is perfect or not..?

//Factors of 6 : 1 2 3 6 --> 1 + 2 + 3 = 6 (perfect number)
//Perfect Number : The given number is equals to the sum of its factors but not itself
public class PrintingPerfectNumber2 {
	
	static boolean isPerfect(int n) {
		 boolean flag = false;
		 int sum = 0;
		 
		 for(int i = 1; i <= n / 2; i++) { 
			 if(n % i == 0) {
				 sum = sum + i;
			 }
		 }
		 if(sum == n) {
			 flag = true;
		 }
		 return flag;
	}
	public static void main(String[] args) {
		System.out.println("Maain Method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
	
		boolean status = isPerfect(num);
		
		if(status) {
			System.out.println("The given number is Perfect");
		} else {
			System.out.println("The given number is not a Perfect");
		}
        sc.close();
	}

}
