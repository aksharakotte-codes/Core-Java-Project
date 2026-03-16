package com.operators;

public class Assignment3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		int x = 1, y = 1, z = -2;
		int result = (x++ * y++) - z-- + (y*x--) - (--z*y);
		
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);
		System.out.println("Value of z : " + z);
		System.out.println("Value of Result : " + result);
		
		System.out.println("Main Method Ended!!!");
	}

}
