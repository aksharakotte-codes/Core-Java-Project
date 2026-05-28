package com.exceptionhandling;

public class NullPointerEx1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
        System.out.println("Main Method started");
        
        String s = "Akshara";//7
        System.out.println(s.length());
        
        String s1 = "";//0
        System.out.println(s1.length());
        
        String s2 = "null";//4
        System.out.println(s2.length());
        
        
		try {
			System.out.println("In Try");
			String s3 = null;//null dot anything is called as NPE
	        System.out.println(s3.length());//NullPointerException
		} catch (Exception e) {
			System.err.println("In Catch");
			e.printStackTrace();
		}
		
		System.out.println("Main Method Ended");
	}

}
