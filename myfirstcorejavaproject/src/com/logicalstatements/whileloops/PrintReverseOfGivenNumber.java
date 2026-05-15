package com.logicalstatements.whileloops;

import java.util.Scanner;

//WAP to Print the Reverse Number of a Given Number ..?
//WAp to find the Given Number is Palindrome or not..?
public class PrintReverseOfGivenNumber {

	public static void main(String[] args) {
		System.out.println("Main Method Started !");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();//456
		 
		int r =  0;
		int rev = 0;
		
		while(n != 0) {
			r = n % 10;// 456 % 10 = 6, 45 % 10 = 5, 4 % 10 = 4
			n = n / 10;//456 / 10 = 45 , 45 / 10 = 4, 4 /10 = 0
			rev = rev * 10 + r;//0 * 10 + 6 = 6, 6 * 10 + 5 = 65, 65 * 10 + 4 = 654
		}
		
		System.out.println("Reverse the given number : " + rev);
		sc.close();
		System.out.println("Main Method Ended !"); 
	}

}
