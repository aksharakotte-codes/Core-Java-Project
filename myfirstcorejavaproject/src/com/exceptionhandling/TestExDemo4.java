package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		try {
			System.out.println("In Try");
//			System.out.println(10 / 0);//AE
			System.out.println(10.5 / 0);//Infinity
			System.out.println(10.5 / 0.0);//Infinity
			System.out.println(0.0 / 0.0);//NaN
			System.out.println(0 / 0.0);//NaN
			
		} catch(Exception e) {
			System.err.println("In Catch");
			System.err.println(e.getMessage());//DescriptionOnly
			System.err.println(e.toString());// Name + Description only
			System.err.println(e);// Name + Description only
		}
	}

}
