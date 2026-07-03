package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo17 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		String str = "Java is Simple in Vcube java is best";
		
		str = str.replace('i', 'e');
		System.out.println(str);
		
		str = str.replace("java", "Spring Boot");     
		System.out.println(str);
		System.out.println("***************************");
		
		String str1 = "Java 500090 Hyderabad 1234";
		str1 = str1.replaceAll("\\d", "X");// where \\d changes numbers to X 
		System.out.println(str1);
		
		String str2 = "AMBCD1245A";
		str2 = str2.replaceAll("\\D", "A");//where \\D change alphabets to A
		System.out.println(str2);		
		System.out.println("Enter a Phone Number");
		String phone = sc.next();
		boolean phnStatus = phone.matches("^[6-9]{1}[0-9]{9}$");
		System.out.println(phnStatus);
		
		//ABDCE1234A
		System.out.println("Enter a Pan Number");
		String pan = sc.next();
		boolean panStatus = pan.matches("^[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}$");
		System.out.println(panStatus);
		
		sc.close();
		System.out.println("Main Method Ended");

	}
}

