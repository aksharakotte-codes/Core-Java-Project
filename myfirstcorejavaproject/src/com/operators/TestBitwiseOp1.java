package com.operators;

//Bitwise Operators--> | & ^ ~
public class TestBitwiseOp1 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!!");
		
		int a = 10;
		int b = 20;
		int c = 10;
		
//		AND Bitwise Operator &
		System.out.println("****************************");
		System.out.println(a == c & a != b);//true
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		System.out.println(72 & 10);//8
		System.out.println(36 & 4);//4
		System.out.println(65 & 6);//0
		System.out.println(24 & 3);//0
		System.out.println("****************************");

//		OR Bitwise Operator |
		System.out.println("****************************");
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		
		System.out.println(72 | 10);//74
		System.out.println(36 | 4);//36
		System.out.println(65 | 6);//71
		System.out.println(24 | 3);//27
		System.out.println("****************************");
		
//		XOR Bitwise Operator ^
		System.out.println("****************************");
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		
		System.out.println(72 ^ 10);//66
		System.out.println(36 ^ 4);//32
		System.out.println(65 ^ 6);//71
		System.out.println(24 ^ 3);//27
		System.out.println("****************************");
		
//		NOT Bitwise Operator ~
		System.out.println("****************************");
		System.out.println(~10);// (~10) = -(10+1) = -11
		System.out.println(~66);// (~66) = -(66+1) = -67
		System.out.println(~ -11);// (~ -11) = (11-1) = 10
		System.out.println("****************************");
	}

}
