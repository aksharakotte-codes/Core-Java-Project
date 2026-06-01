package com.exceptionhandling;

import java.util.Scanner;

//In Java, Finally block executes always, whether there is a problem or not.
//Mainly we use finally block for closing the connections or resources
//Example : Scanner, Connection File related classes.
public class TestExDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		try {
			System.out.println("In Try");
			System.out.println(10 / 0);
			System.out.println(a * 10);
		} catch(Exception e) {
			System.err.println("In Catch");
		} finally {
			System.out.println("In Finally");
			
			sc.close();
		}

	}

}
