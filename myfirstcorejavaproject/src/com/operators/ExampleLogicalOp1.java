package com.operators;

//Logical Operators : || && !
//Logical Operators will give the result of boolean values like true or false.

public class ExampleLogicalOp1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
//		And &&
		
//		If one false is there then it is false
		
		System.out.println(a <= c && a < b);// true
		System.out.println(a < c && b < c);// false
		
		
//		Or ||
//		 If one true is there then it is true
		
		System.out.println(a > b || a ==c);// true
		System.out.println(a == c || a < b);// true
		System.out.println(a < b || a != c);// true
		System.out.println(a > b || a != c);//false
		
//		Not !
//		It gives opposite of actual answer
		
		System.out.println(!(a == c));//false
		System.out.println(!(b < c));// true
	
	}

}
