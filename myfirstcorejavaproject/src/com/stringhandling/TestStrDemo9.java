package com.stringhandling;

//ASCII-Values
//A - Z => 65-90
//a - z => 97-120
public class TestStrDemo9 {

	public static void main(String[] args) {
		String s1 = "Abhi";
		String s2 = "Abhi";
		
//		Compares two strings lexicographically.
		System.out.println(s1.compareTo(s2));
		
		//k:107 - n:110 => -3
		String s3 = "Srikanth";
		String s4 = "Srinivas";
		System.out.println(s3.compareTo(s4));
		
		//J:74 - j:106 = -32
		String s5 = "Java";
		String s6 = "java";
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareToIgnoreCase(s6));
		
		//j:97 - J:65 = 32
		String s7 = "abc";
		String s8 = "ABC";
		System.out.println(s7.compareTo(s8));
		
		// Srikanth --> 9 extra letters with including space
		String s9 = "Java";
		String s10 = "Java Srikanth";
		System.out.println(s9.compareTo(s10));
		
		System.out.println(s9.concat(s10));
		System.out.println("Srikanth" + "Java" + 10.5 + "" + 9);
		
		String s11 = "Spring";
		System.out.println(s11.contentEquals("Spring"));//true
		System.out.println(s11.contentEquals("S p r i n g"));//false
		
		String s12 = "Spring";
		System.out.println(s11.contentEquals(s12));//true
		System.out.println(s11.equalsIgnoreCase("SpRING"));//true
	}

}
