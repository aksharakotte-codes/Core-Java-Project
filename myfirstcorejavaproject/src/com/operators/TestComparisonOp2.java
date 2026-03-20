package com.operators;

public class TestComparisonOp2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
         int a = 5;
         int b = 5;
         int c = 10;
         
         System.out.println(a > b);//false
         System.out.println(a > c);//false
         System.out.println(a >= b);//true
         System.out.println(a >= c);//false
         
         System.out.println(a <= c);//true
         System.out.println(a <= b);//true
         System.out.println(b < c);//true
         
         System.out.println(a != b);//false
         System.out.println(a != c);//true
         
	}

}
