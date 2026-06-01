package com.exceptionhandling;

//In try, try with finally is possible just for closing resources and connections 
//but not for Grateful Termination of the code
//If the code should be Grateful Termination means, we should use catch block;
//Without catch block we can except Grateful Termination if something went wrong in your code
public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		try {
			System.out.println("In Try");
			System.out.println(10 / 0);
		} catch(ArithmeticException e) {
			System.err.println("In Catch of AE");
		} catch(Exception e) {
			System.err.println("In Catch of E");
		} finally {
			System.out.println("In Finally");
		}
		
//		We can write multiple catch blocks, but not finally(Syntax Error)
//		finally {
//		System.out.println("In Finally");
//	    }  
		
//		After try finally we cannot use catch block, 
//		try-catch-finally we must follow the order
//		catch(Exception e) {
//			System.err.println("In Catch");
//		}
		
		System.out.println("Main Method Ended");
	}

}
