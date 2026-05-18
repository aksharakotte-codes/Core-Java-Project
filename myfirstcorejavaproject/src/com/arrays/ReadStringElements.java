package com.arrays;

//WAP to read the String elements from the Scanner and prints whose names starts with s and ends with a..?
import java.util.Scanner;

public class ReadStringElements {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		System.out.println("Enter the elements :");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}
		
		for(String str : arr) {
			if(str.toLowerCase().startsWith("s") || str.endsWith("a")) {
				System.out.println(str);
			}
		}
		sc.close();
	}

}
//Output
//Main Method Started!!
//Enter a size :
//5
//Enter the elements :
//Anjali
//Akshara
//SriHarshini
//Vyshnavi
//Rahul

//After printing whose names starts with s and ends with a from above elements :
//Akshara
//SriHarshini

