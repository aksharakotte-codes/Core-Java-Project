package com.logicalstatements.whileloops;

//WAP to print the sum of Given Numbers..?
//input : 345
//output: 3 + 4 + 5 = 12
import java.util.Scanner;

public class PrintSum {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		
		while (n != 0){
			r = n % 10;//345 % 10 = 5, 34 % 10 = 4, 3 % 10 = 3--> 5 4 3 
			n = n / 10;//345 / 10 = 34, 34 / 10 = 3, 3 / 10 = 0 -->34 3 0
			sum = sum + r;
			
		}
		
		System.out.println("Sum of Given Numbers : " + sum);
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
