package com.operators;

//Logical Operators : || && !
//Logical Operators will give the result of boolean values like true or false.

public class TestLogicalOp1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
//		And &&
		
		System.out.println(a == b && a == c);// false
		System.out.println(a > b && a ==c);// false
		System.out.println(a == c && a < b);// true
		System.out.println(a < b && a != c);// false
		
		System.out.println(a <= c && a < b);// true
		System.out.println(a < c && b < c);// false
		
		System.out.println("****************************");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		System.out.println("****************************");
		
//		Or ||
		
		System.out.println(a == b || a == c);// true
		System.out.println(a != b || a != c);// true
		
		System.out.println(a > b || a ==c);// true
		System.out.println(a == c || a < b);// true
		System.out.println(a < b || a != c);// true
		System.out.println(a > b || a != c);//false
		
		System.out.println("****************************");
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		System.out.println("****************************");
		
//		Not !
		System.out.println(!(a == c));//false
		System.out.println(!(b < c));// true
		
		System.out.println("****************************");
		System.out.println(!true);//false
		System.out.println(!false);//true
		System.out.println("****************************");
	}

}
