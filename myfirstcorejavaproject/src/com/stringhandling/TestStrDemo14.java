package com.stringhandling;

public class TestStrDemo14 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String s1 = "Java";//It is storing in SCP
		String s2 = new String("Java");//It is Storing in heap
		s2 = s2.intern();//Converting Heap to SCP is the concept of intern
		System.out.println(s1 == s2);// false --> true
		
		String str = "Java is Simple in Vcube in Jntu";
		
		System.out.println("Count of 3rd 'i' in the String :");
		System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i') + 1)+1));// 15
		
		System.out.println("Count of 2nd 'i' in the String :");
		System.out.println(str.indexOf('i',str.indexOf('i') + 1));// 9
		
		System.out.println("Count of 1st 'i' in the String : ");
		System.out.println(str.indexOf('i'));// 5
		
		System.out.println("Count of Last 'i' from the String :");
		System.out.println(str.lastIndexOf('i'));// 24
		
		System.out.println(str.indexOf("in"));//15
		System.out.println(str.indexOf("in", str.indexOf("in") + 1));//24
		
		System.out.println("Main Method Ended");
	}

}
