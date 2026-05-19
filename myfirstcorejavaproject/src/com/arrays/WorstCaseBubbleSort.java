package com.arrays;

public class WorstCaseBubbleSort {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int[] arr = {30, 40, 20, 15, 5, 2};//6 --> 0 1 2 3 4 5
		int temp = 0;
		int count = 0;
		int count1 = 0;
		
		System.out.println("Sorted array : Before Sort");
		for(int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length-1; i++) {
			count++;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count1++;
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println(count1);
		System.out.println("Sorted array : After Sort");
		for(int a : arr) {
			System.out.print(a + " ");
		}	
	}
}
