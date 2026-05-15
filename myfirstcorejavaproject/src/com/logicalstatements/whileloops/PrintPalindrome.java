package com.logicalstatements.whileloops;

import java.util.Scanner;
//WAp to find the Given Number is Palindrome or not..?
public class PrintPalindrome {

	public static void main(String[] args) {
		System.out.println("Main Method Started !");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();//434
		
		int temp = n;
		
		int r =  0;
		int rev = 0;
		
		while(n != 0) {
			r = n % 10;// 434 % 10 = 4, 43 % 10 = 3, 4 % 10 = 4
			n = n / 10;//434 / 10 = 43 , 43 / 10 = 4, 4 /10 = 0
			rev = rev * 10 + r;//0 * 10 + 4 = 4, 4 * 10 + 3 = 43, 43 * 10 + 4 = 434
		}
		
		System.out.println("Reverse the given number : " + rev);
		
		if(temp == rev) {
			System.out.println("The Given Number is Palindrome");
		} else {
			System.out.println("The Given Number is Not a Palindrome");
		}
		
		sc.close();
		System.out.println("Main Method Started !"); 
	}

}
