package com.exceptionhandling;

public class TestExDemo3 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
        System.out.println("Main Method Started");
		
		try {
			System.out.println("In Try");
			System.out.println(10 / 0);
			String str = null;
	        System.out.println(str.length());
			
	    } catch(NullPointerException | ArithmeticException e) { 
			System.err.println("In Catch" + e.getMessage());//Gives Description
			System.err.println("In Catch" + e.toString());//Gives Location
			System.out.println(e);
		}
		System.out.println("Main Method Ended");

	}

}
