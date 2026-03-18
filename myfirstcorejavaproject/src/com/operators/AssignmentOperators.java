package com.operators;
//Today's Task
import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : " );
		int a = sc.nextInt();//10
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();//3
		
		System.out.println("Addition : " + (a+b));//13
		
		System.out.println("Subtraction : " + (a-b));//7
		
		System.out.println("Multiplication : " + a*b);//30
		
		System.out.println("Division : " + a/b);//3
		
		System.out.println("Modulus : " + a%b);// 1 
		
		sc.close();

	}

}

