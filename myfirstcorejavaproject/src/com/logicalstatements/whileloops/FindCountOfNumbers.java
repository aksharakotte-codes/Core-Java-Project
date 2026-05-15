package com.logicalstatements.whileloops;

import java.util.Scanner;

//WAP to find the Count of Given Numbers..?
//input : 123
//output : 3
public class FindCountOfNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();//123
		int r = 0;
		int count = 0;
		
		while(n != 0) {
			r = n % 10;//123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1--> 3 2 1
			
			n = n / 10;//123 / 10 = 12, 12 / 10 = 1, 1 / 10 = 0 -->12 1 0
			count++;
		}
		
		System.out.println("Count of Given Number is : " + count);
		sc.close();
		System.out.println("Main Method Ended!!");

	}

}
