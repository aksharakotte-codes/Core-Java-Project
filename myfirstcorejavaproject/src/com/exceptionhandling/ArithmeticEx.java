package com.exceptionhandling;

import java.util.Scanner;
public class ArithmeticEx {

		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number : ");
			int a = sc.nextInt();// 10 
			
			System.out.println("Enter b number : ");
			int b = sc.nextInt();// 5 or 0
			
			try {
				System.out.println("In Try :");
				System.out.println(a / b);// 10/5 --> 2 or 10/0 --> catch prints
//				In place of ArithmeticException --> Object: 
//				No exception of type Object can be thrown; 
//				an exception type must be a subclass of Throwable
//				Throwable or Exception or RunTimeException or ArithmeticException
				
			} catch(ArithmeticException ex) {
				System.err.println("In Catch :");
				System.err.println("We should not enter zero's");
				ex.printStackTrace();
			}
			
			sc.close();
			System.out.println("Main Method Ended"); 
		}

	}
