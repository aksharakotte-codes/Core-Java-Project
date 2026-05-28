package com.exceptionhandling;

import java.util.Scanner;

public class InputMisMatchEx {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number : ");
			int a = sc.nextInt();//56 or ten
			System.out.println(a * 10);//560  InputMismatchException
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
		System.out.println("Main Method Ended"); 

	}

}
