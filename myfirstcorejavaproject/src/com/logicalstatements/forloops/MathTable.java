package com.logicalstatements.forloops;

import java.util.Scanner;

//WAP to print the Math table from 0 t0 20 Based on Given Numbers..?
//suppose, input is : 9(you can take any nuumber)
//Output should be like
//9X1=9
//9X2=18
//9X3=27
//9X4=36
//9X5=45
//9X6=54
//9X7=63
//9X8=72
//9X9=81
//9X10=90
//9X11=99
//9X12=108
//9X13=117
//9X14=126
//9X15=135
//9X16=144
//9X17=153
//9X18=162
//9X19=171
//9X20=180
public class MathTable {

	public static void main(String[] args) {
		System.out.println("main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which number to proceed: " );
		int n = sc.nextInt();
		System.out.println("Enter up to where you want to print: " );
		int n1 = sc.nextInt();
		
		System.out.println("Math table is : " );
		for(int i = 1; i <= n1; i++) {
			System.out.println(n + "X" + i + "=" + n * i);
		}
		
		sc.close();
		System.out.println("main Method Ended!!");

	}

}
