package com.exceptionhandling.checked;

import java.util.Scanner;

public class ThrowVsThrows {

	
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main Method Started !!");
		
//		String s = null;
//		System.out.println(s.length());
//		
//		Class.forName("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a = sc.nextInt();
		
		System.out.println("Enter b Number :");
		int b = sc.nextInt();
		
		if(b != 0) {
			System.out.println(a / b);
		} else {
			throw new ArithmeticException("Don't send zeos in b value !!");
		}
		
       sc.close();
		System.out.println("Main Method Ended !!");
	}

}
