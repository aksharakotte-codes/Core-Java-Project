package com.logicalstatements.whileloops;

public class GCD {
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;// 56 12 8 
			b = a % b;
			a= temp;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		int a = 12;
		int b = 56;
		
		int gcdvalue = gcd(a, b);
		System.out.println("GCD value is :" +gcdvalue);
		
		int lcm = (a * b) / gcd(a, b);
		System.out.println("LCM value is :" + lcm);
	}

}
