package com.stringhandling;
//WAP to Remove Duplicate elements from an given Array..?
//Java --> Jav

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First String :");
		String str = sc.next();//Java
		String result = "";
		
		for(int i = 0; i< str.length(); i++) {
			char c = str.charAt(i);
			
			if(result.indexOf(c) == -1) {
				result = result + c;
			}
		}
		
		System.out.println("Remove Duplicate Elements from Given String is : " + result);
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
