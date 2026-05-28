package com.exceptionhandling;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		try {
			System.out.println("In try ");
			System.out.println(10/0);
		} catch (Exception e) {
			System.err.println("In Catch");
		}
		
		System.out.println("Main Method Ended");
	}

}
