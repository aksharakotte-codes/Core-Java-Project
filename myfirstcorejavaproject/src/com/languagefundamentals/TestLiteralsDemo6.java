package com.languagefundamentals;

//Null Literals
public class TestLiteralsDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
//		int a = null;//InValid --> Type mismatch: cannot convert from null to int
		
//		Null is a literal;We can store for only object data types 
//		whenever we don't to share any values.
		
		
//		The purpose, Whenever we want to change the values later
//		then we can give starting with null for any Object data type. 
		
//		Null true or false look like a keywords but not the keywords .
		
		String s = null;
		String s1 = "null";
		Integer i = null;
//		Integer i = "null";//Type mismatch: cannot convert from String to Integer
		TestLiteralsDemo6 t1 = null;
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(t1);
		
		t1 = new TestLiteralsDemo6 (); 
	}

}
