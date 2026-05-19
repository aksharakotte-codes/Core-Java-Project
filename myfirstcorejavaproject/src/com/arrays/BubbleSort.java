package com.arrays;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int[] arr = {30, 40, 20, 15, 5, 2};//6 --> 0 1 2 3 4 5
		int temp = 0;
		
		System.out.println("Sorted array : Before Sort");
		for(int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array : After Sort");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
