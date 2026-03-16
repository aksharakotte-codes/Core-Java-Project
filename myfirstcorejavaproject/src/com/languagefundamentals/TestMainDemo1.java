package com.languagefundamentals;

//Command Line Arguments
public class TestMainDemo1 {

	public static void main(String[] names) {
		System.out.println("Main Method Started!!!");
		
//		String to int values we can use below method
		int i = Integer.parseInt(names[0]);
		int i1 = Integer.parseInt(names[1]);
		
		System.out.println("Sum of both : " + (i + i1));
		
		//for each loop
		for(String n : names) {
			System.out.println(n);
		}
	}

}
