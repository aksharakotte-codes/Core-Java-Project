package com.exceptionhandling;

import java.util.Scanner;
//Abnormal Termination : If something went wrong in middle of the
//program application then all your remaining code is not executes
public class AbnormalTermination {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 10
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();// 0
		
		System.out.println(a / b);
//		Exception in thread "main" 
//		Name            :  java.lang.ArithmeticException:
//	    Description     :  / by zero
//		Location        :  at com.exceptionhandling.AbnormalTermination.main(AbnormalTermination.java:17)
		
		sc.close();
		System.out.println("Main Method Ended"); //Not prints
	}

}
