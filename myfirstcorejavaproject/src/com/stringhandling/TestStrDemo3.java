package com.stringhandling;

public class TestStrDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String s1 = "Java";
		String s2 = "Akshara";
		
		s1.concat(s2);
		System.out.println(s1);//Java
		
		String str1 = "Sachin";
		String str2 = "Tendulkar";
		
		str1 = str1.concat(str2);
		System.out.println(str1);//SachinTendulkar
		
		System.out.println("Main Method Ended");
	}

}
