package com.languagefundamentals.methods;

public class ExampleOfPrintOddNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Priniting Odd Numbers from 1 to 50");
		getOddNumbers(25);

	}
	
	static void getOddNumbers(int n) {
		if (n==0) {
			return;
		}
		getOddNumbers(n-1);
		System.out.println(2*n-1);
	}
}
