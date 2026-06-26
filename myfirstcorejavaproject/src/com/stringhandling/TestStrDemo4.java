package com.stringhandling;

//String Concatenation
//Concat Method will expect only String we can do only String Concatenation
//But + Operator we can Concatenate any other data type
public class TestStrDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String str1 = "Hello";
		String str2 = "Java";
		String str3 =  str1.concat(str2);// HelloJava
		
		System.out.println(str3);
		
		String s1 = "Rahul";
		String s2 = "Dravid";
		int i = 1234; 
		String s3 =  s1 + s2 + i; // RahulDravid1234
		
		System.out.println(s3);
		
		int i1 = 10;
		int i2 = 20;
		String s6 = "Java";
		System.out.println(s6 + i1 + i2);// Java1020
		System.out.println(i1 + i2 + s6 + "Akshara" + 40 + 50);// Java1020
		
		System.out.println("Main Method Ended");
	}

}
