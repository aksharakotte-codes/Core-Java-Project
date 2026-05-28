package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		try {
			System.out.println("In Try");
			String str = "Srikanth";
			
			int x = str.indexOf('r');
			System.out.println(x);//1
			
			System.out.println(10 / 0);
			//Above line checks for ArithmeticException catch block
			//It does not appear So execution stops and gives ArithmeticException 
			System.out.println("Hello");
			
			
//			Unreachable catch block for NullPointerException. 
//			It is already handled by the catch block for Exception
		} catch(NullPointerException e) {//Child class should be up only
			System.out.println("In Catch of NPE");
			e.printStackTrace();
		} catch(ArithmeticException e) {//Child class should be up only
		    System.out.println("In Catch of AE");
		    e.printStackTrace();
	    } catch(Exception e) { //Parent class should be down only,otherwise it will give u NPE
			System.out.println("In Catch of E");
			e.printStackTrace();
		}
		System.out.println("Main Method Ended");
	}

}
