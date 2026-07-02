package com.stringhandling;

public class TestStrDemo8 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		String str = "Java Akshara";
		
//		Returns the character (Unicode code point) at the specified index.
		System.out.println(str.codePointAt(1));//97
//		Returns the character (Unicode code point) before the specified index.
		System.out.println(str.codePointBefore(1));//74
//		Returns the number of Unicode code points in the specified text range of this String
		System.out.println(str.codePointCount(1, 6));//5
		
		System.out.println("Main Method Ended!!");
	}

}
