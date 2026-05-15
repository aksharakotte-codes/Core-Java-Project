package com.logicalstatements.whileloops;

//Write a program convert Decimal to Binary..?
//input : 10
//output : 1010
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();// 18
		int r = 0;
		String rev = " ";
		
		while(n != 0) {
			r = n % 2;// 18%2=0,9%2=1,4%2=0,2%2=0,1%2=1
			n = n /2;// 18/2=9,9/2=4,4/2=2,2/2=1,1/2=0
			rev = r + rev;
		}
		
		System.out.println("Decimal to Binary is : " + rev + " ");
		sc.close();
		System.out.println("Main Method Ended");
		

	}

}
