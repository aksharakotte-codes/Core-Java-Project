package com.operators;

public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		int x = 1, y=1;
		int result = x++ - --y + x++ * ++y + --y - --x + x++ + y++;
		
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);
		System.out.println("Value of Result : " + result);
		
		System.out.println("Main Method Ended!!!");
	}

}
