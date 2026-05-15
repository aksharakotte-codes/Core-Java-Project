package com.logicalstatements.whileloops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int a = num * num;
        int sum = 0;
        
        while(a > 0) { 
        	
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        
        System.out.println("Sum of Neon Number : " + sum);
        if(sum == num) {
            System.out.println("given number is a Neon number");
        } else {
            System.out.println("given number is not a Neon number");
        }
		
        sc.close();
		System.out.println("Main Method Ended!!");

	}

}
