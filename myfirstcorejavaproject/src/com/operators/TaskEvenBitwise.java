package com.operators;
//Example Bitwise
import java.util.Scanner;

public class TaskEvenBitwise {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();//11
		
		String result = (a & 1) == 0 ? "Even Number" : "Odd Number";
		System.out.println(result);//Odd Number
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();//22
		
		String result1 = (b | 1) > b ? "Even Number" : "Odd Number";
		System.out.println(result1);//Even Number
		
		System.out.println("Enter a number : ");
		int c = sc.nextInt();//34
		
		String result2 = (c ^ 1) > c ? "Even Number" : "Odd Number";
		System.out.println(result2);//Even Number
		
		sc.close();
		System.out.println("Main Method Ended!!");

	}

}
