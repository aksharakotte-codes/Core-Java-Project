package com.languagefundamentals.methods;

public class ExampleOfPrintEvenNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Priniting Even Numbers from 1 to 50");
		getEvenNumbers(25);

	}
	
	static void getEvenNumbers(int n) {
		if (n==0) {
			return;
		}
		getEvenNumbers(n-1);
		System.out.println(2*n);
	}
}
