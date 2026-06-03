package com.exceptionhandling;

//Finally Dominates return, So finally executes without fail
public class TestExDemo8 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		try {
			System.out.println("In Try");
			System.exit(0);//Where Ever you use this line,From there it is not going to executes remaining lines
			return; 
		} catch(Exception e) {
			System.err.println("In Catch");
		} finally {
			System.out.println("In Finally");	
		}
		
		System.out.println("Main Method Ended");
		
	}

}
