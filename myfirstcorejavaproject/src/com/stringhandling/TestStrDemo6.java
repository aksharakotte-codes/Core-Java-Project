package com.stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		Initializes a newly created String object so that it represents an empty character sequence
		String s1 = new String();
		System.out.println(s1);
		
		System.out.println("********************"); 
		String str = "abc";
		
		int[] arr = {1, 2, 3};
		System.out.println(arr);//Address of the Object
		
		char data[] = {'a', 'b', 'c'};
		String str1 = new String(data);//abc
		
		System.out.println(data);//abc
		System.out.println(str1);//abc
		System.out.println(str == str1);//false
		System.out.println(str.equals(str1));//true

	}

}
