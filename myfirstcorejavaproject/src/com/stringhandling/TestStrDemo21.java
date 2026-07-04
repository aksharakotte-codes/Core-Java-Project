package com.stringhandling;

public class TestStrDemo21 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		StringBuffer sb = new StringBuffer("Srikanth");
		System.out.println(sb);
		
		String s1 = "Akshara";
		s1.concat("Java");
		System.out.println(s1);//Akshara
		
//		CE :Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb1 = "Akshara Java";//String Literals only for String but not for any class. 
//		System.out.println(sb1);
		
//		StringBuffer and StringBuilder both are Mutable
//		If our recruitment is synchronization related functionalities the go for StringBuffer.
//		If we what to work for multiple threads parallel then will use StringBuilder for better performance.
		StringBuffer sb1 = new StringBuffer("Srikanth");
		sb1.append("Java");
		System.out.println(sb1);//SrikanthJava
		
		StringBuffer sb2 = new StringBuffer("Srikanth");
		sb2.append("Java");
		System.out.println(sb2);//SrikanthJava
		
		System.out.println("Main Method Ended!!");

	}

}
