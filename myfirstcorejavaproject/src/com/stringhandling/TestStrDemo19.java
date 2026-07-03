package com.stringhandling;

import java.util.Scanner;

//WAP to find vowels and consonants from given String..?
public class TestStrDemo19 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine().toLowerCase();
		
		char[] ch = str.toCharArray();
		int vowCount = 0;
		int consCount = 0;
		int digiCount = 0;
		
		for(char c : ch) {
			if(c >= 'a' && c <= 'z') {
			   if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				  vowCount++;
			   } else {
				  consCount++;
			   }	  
			} else if(Character.isDigit(c)) {
				digiCount++;
			}
		}
		
		System.out.println("Vowles Count is : " + vowCount );
		System.out.println("Consonant Count is : " + consCount );
		System.out.println("Digit Count is : " + digiCount );
		
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}

//Output :
//Main Method Started!!
//Enter a String :
//Java is simple in vcube 500028
//Vowles Count is : 8
//Consonant Count is : 11
//Digit Count is : 6
//Main Method Ended!!

