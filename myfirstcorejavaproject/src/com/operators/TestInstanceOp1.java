package com.operators;

public class TestInstanceOp1 {

	public static void main(String[] args) {
		
		Integer i1 = 10;
		System.out.println(i1 instanceof Integer);//true
		System.out.println(i1 instanceof Number);//true
		System.out.println(i1 instanceof Object);///true
		
		String s1 = "Srikranth";
		
//		Incompatible conditional operand types String and Integer
//		System.out.println(s1 instanceof Integer);//CE
		
		System.out.println(s1 instanceof String);//true
		
		Number n = 100;
		System.out.println(n instanceof Number);//true
		System.out.println(n instanceof Integer);//true
		
		Number n1 = null;
		System.out.println(n1 instanceof Number);//false
		System.out.println(n1 instanceof Integer);///false

	}

}
