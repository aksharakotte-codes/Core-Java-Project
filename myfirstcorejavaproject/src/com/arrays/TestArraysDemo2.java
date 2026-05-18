package com.arrays;

public class TestArraysDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		Declaration and Creation in single line
		int[] numbers = new int[10];
		
		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 105; 
		numbers[3] = 106;
		numbers[4] = 109;
		numbers[5] = 110;
		numbers[6] = 111;
		numbers[7] = 112;
		numbers[8] = 100;
		numbers[9] = 113;
		
//		Enhanced for loop or for each loop
		for(int i : numbers) {
			System.out.println(i); 
		}
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i] + " ");//index values
//			
//			I just want even numbers
//			if (numbers[i] % 2 == 0) {
//				System.out.println(numbers[i] + " ");
//			}
//		}
		
		
		System.out.println("Main Method Ended");
	}

}
