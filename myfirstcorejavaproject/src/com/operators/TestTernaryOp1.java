package com.operators;

import java.util.Scanner;

//Ternary Operators --> ? true : false
//Syntax :
// condition ? value_if_true : value_if_false
public class TestTernaryOp1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		int a = 10;
		int b = 20;
		
		int max = (a > b) ? a : b;
		System.out.println("Max values is :" + max);//20
		
		int x = 10;
		int y = 20;
		int z = 5; 
		
		int max1 = (x > y) ? (x > z ? x : z) : y ;
		System.out.println("Max1 value is : " + max1);//20
		
		int x1 = 100;
		int y1 = 200;
		int z1 = 500;
		
		int max2 = (x1 > y1) ? (x1 > z1 ? x1 : z1) : (y1 > z1 ? y1 : z1); 
		System.out.println("Max2 value is : " + max2);//500
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ? " );
		
		int age = sc.nextInt();
		
//		boolean isEligible = (age > 18) ? true : false;
		
		String isEligible = (age > 18) ? "Yes" : "No";
		System.out.println("Entered age is Eligible : " + isEligible);//Yes or No
		
		
		sc.close();
	}
}
