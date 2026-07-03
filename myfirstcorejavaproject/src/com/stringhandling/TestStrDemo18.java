package com.stringhandling;

public class TestStrDemo18 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		String str = "        Java       is Simple       ";
		System.out.println(str);
//		with all leading and trailing space removed
		str = str.trim();
		System.out.println(str);
		
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		
		String str1 = "Hyderabad";
//		beginIndex the beginning index, inclusive.
//		endIndex the ending index, exclusive.
		System.out.println(str1.substring(0, 3));//Hyd
		System.out.println(str1.subSequence(0, 3));//Hyd
		
		int i = 100;
//		char c = 'A';
		double sal = 500000.00;
		
//		String str2 = "Srikanth";
		
//		ANy data type to convert into String will use valueOf() method
		String i1 = String.valueOf(i);
		String sal1 = String.valueOf(sal);
		
		System.out.println(100 + i);//200
		System.out.println(100 + i1);//100100
		System.out.println(100000.00 + sal1);//100000.0500000.0
		
		String i2 = "100";
		System.out.println(100 + i2);//100100
		
//		String to int conversion
		int i3 = Integer.parseInt(i2);
		System.out.println(100 + i3);//200
		
//		String to long conversion
		String phn = "9972677655";
		long phn1 = Long.parseLong(phn);
		System.out.println(phn1);//9972677655
		System.out.println("Main Method Ended!!");
	}

}
