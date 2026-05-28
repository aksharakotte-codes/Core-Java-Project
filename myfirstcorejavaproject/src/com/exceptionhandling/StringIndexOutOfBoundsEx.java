package com.exceptionhandling;

public class StringIndexOutOfBoundsEx {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		try {
			System.out.println("In Try");
			String str = "Akshara";
			System.out.println(str.charAt(7));
			
			System.out.println(10 / 0);
			//Above line checks for ArithmeticException catch block
			//It does not appear So execution stops and gives ArithmeticException 
			System.out.println("Hello");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("In Catch");
			e.printStackTrace();
		}
		
		System.out.println("Main Method Ended");
	}

}
