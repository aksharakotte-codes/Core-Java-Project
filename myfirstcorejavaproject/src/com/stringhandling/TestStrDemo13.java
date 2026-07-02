package com.stringhandling;

public class TestStrDemo13 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String str = "Java is Simple";
		
		char[] ch = new char[10];
//		str.getChars(0, 4, ch, 0);
		str.getChars(8, 14, ch, 0);
		
		for(char c : ch) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		System.out.println("Main Method Ended");
	}

}
