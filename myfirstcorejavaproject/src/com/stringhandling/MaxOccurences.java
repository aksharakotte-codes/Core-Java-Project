package com.stringhandling;
//WAP to print the Max Occurences from a Given String..?
//input : abbccc
//Output : c
import java.util.Scanner;

public class MaxOccurences { 

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();//abbccc
 		
		int[] arr = new int[127];
		
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		
		int max = -1;
		char maxChar =' ';
		
		for(int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxChar = str.charAt(i);
			}
		}
		
		System.out.println("Max occurences Character is : " + maxChar);//c
		
		
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
