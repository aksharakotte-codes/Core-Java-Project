package com.languagefundamentals.methods;

public class ExampleOfPrintNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Priniting Natural Numbers from 1 to 50");
		getNaturalNumbers(49);

	}
	
	static void getNaturalNumbers(int n) {
		if (n==-1) {
			return;
		}
		getNaturalNumbers(n-1);
		System.out.println(1+n);
	}
}
