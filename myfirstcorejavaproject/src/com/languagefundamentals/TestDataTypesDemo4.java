package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Car{
	String name = "KIA";
}

class Dog {
	String name = "Puppy";
}


public class TestDataTypesDemo4 {
	
	
//	Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 100;
//	BigDecimal bd = 200;	
	
	String s1 = "AksharaJava";
	String s2 = new String();
	String s3 = new String("Java is simple");
	String s4;
	
	Integer i3;
	BigInteger bi3;
	BigDecimal bd3;
	Character c3;
	Float f3;
	Double d3;
	Boolean b3;
	
	Car car;
	Dog dog;
	
	BigInteger bi1 = new BigInteger("243687980995767857453442331231426666666677869903456785544234");
	BigInteger bi2 = new BigInteger("2436879809957678574534423312312215626535623432198");
	
	
	BigDecimal bd1 = new BigDecimal("2576374838923167355621647847827.2367375447576352356");
	BigDecimal bd2 = new BigDecimal("2576374838923167355621647847827.2367375447576352356");

	public static void main(String[] args) {
		System.out.println("Main Method started");

		TestDataTypesDemo4 t1 = new TestDataTypesDemo4();
//		STRING
		
		System.out.println("************STRING**************");
		System.out.println("String1:"+t1.s1);// AksharaJava---> String Literals
		System.out.println("String2:"+t1.s2);//
		System.out.println("String3:"+t1.s3);//Java is simple
		System.out.println("String4:"+t1.s4);// null
		
		System.out.println("************NUMBER**************");
		System.out.println("Integer:"+t1.i3);// null
		System.out.println("BigInteger:"+t1.bi3);// null
		System.out.println("BigDecimal:"+t1.bd3);// null
		System.out.println("Charcater:"+t1.c3);// null
		System.out.println("Float:"+t1.f3);// null
		System.out.println("Double:"+t1.d3);// null
		System.out.println("Boolean:"+t1.b3);// null
		System.out.println("Car:"+t1.car);

		System.out.println("Dog:"+t1.dog);// null
		
		Car c = new Car();
		System.out.println("Car:"+c.name);// KIA
		
		Dog d = new Dog();
		System.out.println("Dog:"+d.name);// Puppy
	
		
		
//		BIGINTEGER
		System.out.println("***********BIGINTEGER**********");
		System.out.println(t1.bi1);
		System.out.println(t1.bi2);
		
		System.out.println("Addition for BigInteger:" + t1.bi1.add(t1.bi2));
		System.out.println("Multiplication for BigInteger:" + t1.bi1.multiply(t1.bi2));
		System.out.println("Divide for BigInteger:" + t1.bi1.divide(t1.bi2));
		System.out.println("Double for BigInteger:" + t1.bi1.doubleValue());
		System.out.println("Float for BigInteger:" + t1.bi1.floatValue());
		System.out.println("GCD for BigInteger:" + t1.bi1.gcd(t1.bi2));
		System.out.println("Modulus for BigInteger:" + t1.bi1.mod(t1.bi2));
		
		
		
//		BIGDECIMAL
		
		System.out.println("***********BIGDECIMAL**********");
		System.out.println(t1.bd1);
		System.out.println(t1.bd2);
		
		System.out.println("Addition for BigDecimal:" + t1.bd1.add(t1.bd2));
		System.out.println("Multiplication for BigDecimal:" + t1.bd1.multiply(t1.bd2));
		System.out.println("Divide for BigDecimal:" + t1.bd1.divide(t1.bd2));
		System.out.println("Double for BigDecimal:" + t1.bd1.doubleValue());
		System.out.println("Float for BigDecimal:" + t1.bd1.floatValue());
		
	}

}
