package com.logicalstatements.forloops;

public class ProductOfAllNumbers {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		long prod = 1;
		
		for(long i = 1; i <= 5; i++) {
			prod = prod * i;//1*1=1; 1*2=2; 2*3=6; 6*4=24 24*5=120
		}
		System.out.println("Product of all Numbers : " + prod);
		System.out.println("Main Method Ended!!");

	}

}
