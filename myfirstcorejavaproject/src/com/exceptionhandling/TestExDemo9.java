package com.exceptionhandling;

public class TestExDemo9 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		System.out.println(add());
		
		System.out.println("Main Method Ended!!");
	}
	
	static int add() {
		try {
			System.out.println("In Try");
			System.out.println(10 / 0);
			return 100; 
		} catch(Exception e) {  
			System.err.println("In Catch");
			return 200; 
		} finally {
			System.out.println("In Finally");	
//			return 300; 
		} 
	}

}
