package com.operators;

import java.util.Scanner;

//Arithmetic Operators : + - * / %

//WAP to calculate the values which received from console
public class TestArthimeticOperators {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : " );
		int a = sc.nextInt();//100
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();//50
		
		System.out.println("Addition : " + (a+b));//150
		
		System.out.println("Subtraction : " + (a-b));//50
		
		System.out.println("Multiplication : " + a*b);//5000
		
		System.out.println("Division : " + a/b);//2 --> Quotient
		
		System.out.println("Modulus : " + a%b);//0 --> Remainder 
		
		sc.close();

	}

}
