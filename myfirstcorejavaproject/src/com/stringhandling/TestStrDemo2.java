package com.stringhandling;

public class TestStrDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String city1 = "Hyderabad";
		String city2 = "Hyderabad";
		String city3 = "Hyderabad";
		String city4 = "Hyderabad";
		String city5 = "Bangalore";
		
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(city4);
		
		System.out.println("********************");
		
		city4 = "Bangalore";
//		city4 = city5;
	
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(city4);
		System.out.println(city5);
		
		System.out.println(city4.hashCode());
		System.out.println(city5.hashCode());
		System.out.println("Main Method Ended");
	}

}
