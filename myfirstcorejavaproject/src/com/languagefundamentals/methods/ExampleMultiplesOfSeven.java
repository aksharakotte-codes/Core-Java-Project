package com.languagefundamentals.methods;

public class ExampleMultiplesOfSeven {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		System.out.println("Multiples of seven :");
		getMultiplesOfSeven(10);
	}
	
	static void getMultiplesOfSeven(int n) {
		if (n==0) {
			return ;
		}
		
		 getMultiplesOfSeven(n-1);
		 System.out.println(7 * n);
		
	}
}
