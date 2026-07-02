package com.stringhandling;

public class TestStrDemo15 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		String s1 = "";
		String s2 = new String();
//		String s3 = null;
		String s4 = " ";
		System.out.println(s1.isEmpty());//true --> Returns true if, and only if, length() is 0.
		System.out.println(s1.isBlank());//true --> Returns true if the string is empty or contains only white space
		
		System.out.println(s2.isEmpty());//true
		System.out.println(s2.isBlank());//true
		
//		System.out.println(s3.isEmpty());//NPE
//		System.out.println(s3.isBlank());//NPE
		
		System.out.println(s4.length());//1
		System.out.println(s4.isEmpty());//false
		System.out.println(s4.isBlank());//true
		
		System.out.println("Main Method Ended!!");
	}

}
