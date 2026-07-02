package com.stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String str = "Java is Simple in Vcube";
		
		str = str.replace('i', 'e');
		System.out.println(str);
		
		str = str.replace("java", "Spring Boot");
		System.out.println(str);
		System.out.println("***************************");
		System.out.println("Main Method Ended");

	}
}
