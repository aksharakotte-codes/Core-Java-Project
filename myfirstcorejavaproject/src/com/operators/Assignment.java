package com.operators;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		int x = 0;
		int result = x++ + ++x - ++x + --x - x-- + x++ + ++x;
		
		System.out.println("Value of x : " + x);
		System.out.println("Value of Result : " + result);
		
		System.out.println("Main Method Ended!!!");
	}

}
