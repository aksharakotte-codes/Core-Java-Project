package com.logicalstatements;

import java.util.Scanner;

public class TestLSSwitchDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter B number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter a symbol to proceed to calculation : ");
		String symb = sc.next();
		
		switch(symb) {
		case "+" -> 
		        {
		        	System.out.println("Addition");
		        	System.out.println(a + b);
		        }
		case "-" -> 
		        {
		        	System.out.println("Subtraction");
		            System.out.println(a - b);
		        }   
		case "*" -> 
		        {
		        	System.out.println("Multiplication");
		        	System.out.println(a * b);
		        }
		case "/" -> 
		        {
		        	System.out.println("Division to find quotient");
		        	System.out.println(a / b);
		        }
		case "%" ->
		        {
		        	System.out.println("Modulus to find remainder");
		        	System.out.println(a % b);
		        }
		default -> System.out.println("Invalid Symbol to proceed");
		}
		sc.close();
	}

}
