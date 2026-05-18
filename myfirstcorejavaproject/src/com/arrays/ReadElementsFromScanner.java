package com.arrays;

//WAP to read the elements from the Scanner..?
import java.util.Scanner;

public class ReadElementsFromScanner {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter a elements :");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("Main Method Ended !!");
		
		sc.close();                       
	}

}
