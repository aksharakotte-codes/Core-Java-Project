package com.arrays;

//WAP to print a array in reverse order
public class ReverseOrder {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		int[] arr = {9, 8, 7, 6, 5};//0 1 2 3 4 
		
		System.out.println(arr.length);
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
