package com.logicalstatements.forloops.examples;

import java.util.Scanner;

public class ReverseTable {

	public static void main(String[] args) {
		System.out.println("Main Method started !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Enter up to where you want to print the values : ");
		int n1 = sc.nextInt();
		
		for(int i = n1; i >= 1; i--) {
			System.out.println(n +" " + "X" + " " + i + " " + "=" + " " + n * i);
		}
		sc.close();
		System.out.println("main Method ended");
	}

}
