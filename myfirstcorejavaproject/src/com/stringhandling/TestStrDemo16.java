package com.stringhandling;

public class TestStrDemo16 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		String str = String.join("-", "Java", "is", "Simple", "in", "Vcube");
		System.out.println(str);

		String str1 = "Good-Morning-Kodand-Ram-Have-a-Nice-Day";
//		String[] words = str1.split(\\s);
		String[] words = str1.split("-", 4);
		int count = 0;
		
		for(String word : words) {
			count++;
			System.out.println(word);
		} 
		
		System.out.println("Count of all the words : " + count);
		System.out.println("Main Method Ended!!");
	}

}
