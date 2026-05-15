package com.logicalstatements.whileloops; 

//WAP to find the given number is Armstrong Number or not..?

//Ex : ArmStrong Number
// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
// 370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 153
// 371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
import java.util.Scanner; 

public class PrintArmStrong1 { 
	public static void main(String[] args) { 
		System.out.println("Main Method started!!"); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();//153 
		int n1 = n; 
		int temp = n; 
		int r = 0;
		int sum = 0; 
		int count = 0;
		
		while(n != 0) {
			r = n % 10;//3 5 1
			n = n / 10;//15 1 0 
			count++; 
		} 
		while(n1 != 0) {
			r = n1 % 10;// 3 5 1 
			n1 = n1 / 10;// 15 5 1 
			sum = (int) (sum + Math.pow(r, count)); 
			// sum = sum + r* r* r; 
		} 
			if (sum == temp) { 
				System.out.println("The Given Number is Armstrong number "); 
			} else {
				System.out.println("The Given Number is not a Armstrong"); 
			}
			sc.close(); 
			System.out.println("Main Method ended!!");
	}
}