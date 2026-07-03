package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

//WAP to print whether the given two Strings are Anagram or not ..?
//Silent --> Listen
//eat --> ate
//race --> care
//heart --> earth
public class TestStrDemo20 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First String :");
		String s1 = sc.next();
		
		System.out.println("Enter a Second String :");
		String s2 = sc.next();
		
		if(s1.length() != s2.length()) {
			System.out.println("The Given Strings are not an Anagram");
			return;
		}
		
		char[] ch1 = s1.toCharArray();//{'r', 'a', 'c', 'e'}
		char[] ch2 = s2.toCharArray();//{'c', 'a', 'r', 'e'}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The Given Strings are Anagram");
		} else {
			System.out.println("The Given Strings are not an Anagram");	
		}
		
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}

//Output
//Main Method Started!!
//Enter a First String :
//care
//Enter a Second String :
//race
//The Given Strings are Anagram
//Main Method Ended!!