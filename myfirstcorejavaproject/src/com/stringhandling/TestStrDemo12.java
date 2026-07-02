package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo12 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
		
		System.out.println("*******toCharArray********");
		char[] ch = str.toCharArray();
		for(int i = ch.length - 1; i>= 0; i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("********getBytes()*******");
		byte[] bytes = str.getBytes();
		
//		for(int i = 0; i < bytes.length; i++) {
//			System.out.println((char)bytes[i]);
//		}
		
//		Reverse the String
		for(int i = bytes.length -1; i >= 0; i--) {
			System.out.print((char)bytes[i] + " ");
		}
		
		sc.close();
		System.out.println("Main Method Ended");
	}

}
