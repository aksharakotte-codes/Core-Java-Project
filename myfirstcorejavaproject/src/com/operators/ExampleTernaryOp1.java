package com.operators;

import java.util.Scanner;

//Example Ternary Operator
public class ExampleTernaryOp1 {

	public static void main(String[] args) {
		System.out.println("main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks?");
		int a = sc.nextInt();
		
		String marks = (a >= 35) ? "Pass" : "Fail";
		System.out.println("Entered Marks is for Pass/Fail :" + marks);
		
		
		sc.close();
	}

}
