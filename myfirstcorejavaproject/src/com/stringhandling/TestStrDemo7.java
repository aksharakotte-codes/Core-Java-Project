package com.stringhandling;

import java.util.Scanner;

//Q) WAP to print String in Reverse Order ..? 5 ways
//WAP to find the Given String is Palindrome or not..?
//using charAt
public class TestStrDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String s = sc.next();//Java --> 0 1 2 3
		String rev = "";
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");// J a v a
			rev = s.charAt(i) + rev;
		}
		
		System.out.println();
		System.out.println("Reverse String : " + rev);
		
		if(s.equals(rev)) {
			System.out.println("The Given String is Palindrome");
		} else {
			System.out.println("The Given String is not a Palindrome");
		}
		
		sc.close();
	}

}
