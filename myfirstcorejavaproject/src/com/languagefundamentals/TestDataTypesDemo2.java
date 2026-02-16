package com.languagefundamentals;

public class TestDataTypesDemo2 {

	public static void main(String[] args) {
//		Auto-Boxing converts int -->Integer
//		From primitive data type into wrapper class
//		Byte
		byte a1 = 10;
		Byte b1 = a1;
		System.out.println("Auto-Boxing for Byte:" +b1);
		
//		Short
		short a2 = 20;
		Short b2 = a2;
		System.out.println("Auto-Boxing for Short:" +b2);
		
//		Integer
		int a3 = 30;
		Integer b3 = a3;
		System.out.println("Auto-Boxing for Integer:" +b3);
		
//		Long
		long a4 = 40;
		Long b4 = a4;
		System.out.println("Auto-Boxing for Long:" +b4);
		
//		Float
		float a5 = 50;
		Float b5 = a5;
		System.out.println("Auto-Boxing for Float:" +b5);
		
//		Double
		double a6 = 60;
		Double b6 = a6;
		System.out.println("Auto-Boxing for Double:" +b6);
		
//		Character
	    char a7 = 72;
		Character b7 = a7;
		System.out.println("Auto-Boxing for Character:" +b7);
		
//		Boolean
		boolean a8 = true;
		Boolean b8 = a8;
		System.out.println("Auto-Boxing for Boolean:" +b8);
		
		
//		Auto-UnBoxing converts Integer --> int
//		From wrapper class primitive data type into
//		Byte
		Byte c1 = 10;
		byte d1 = c1;
		System.out.println("Auto-UnBoxing for Byte:" +d1);
		
//		Short
		Short c2 = 20;
		short d2 = c2;
		System.out.println("Auto-UnBoxing for Short:" +d2);
		
//		Integer
		Integer c3 = 30;
		int d3 = c3;
		System.out.println("Auto-UnBoxing for Integer:" +d3);
		
//		Long
		Long c4 = 4000L;
		long d4 = c4;
		System.out.println("Auto-UnBoxing for Long:" +d4);
		
//		Float
		Float c5 = 50.9F;
		float d5 = c5;
		System.out.println("Auto-UnBoxing for Float:" +d5);
		
//		Double
		Double c6 = 689898.567;
		double d6 = c6;
		System.out.println("Auto-UnBoxing for Double:" +d6);
		
//		Character
	    Character c7 = 90;
		char d7 = c7;
		System.out.println("Auto-UnBoxing for Character:" +d7);
		
//		Boolean
		Boolean c8 = false;
		boolean d8 = a8;
		System.out.println("Auto-UnBoxing for Boolean:" +d8);
		
		

	}

}
