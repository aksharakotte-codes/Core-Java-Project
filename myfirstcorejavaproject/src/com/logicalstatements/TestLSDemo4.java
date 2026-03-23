package com.logicalstatements;
//if else Statement Example
import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value :" );
		int a = sc.nextInt();//100
		
		System.out.println("Enter B value :" );
		int b = sc.nextInt();//50
		
		if(a > b) {
			System.out.println("A is Big : " + a);
			
		} else {
			System.out.println("B is Big : " + b);
		}
		
		sc.close();
	}

}
