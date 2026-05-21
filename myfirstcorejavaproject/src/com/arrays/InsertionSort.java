package com.arrays;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		int[] arr = { 4, 3, 2, 1 };
		int temp, j;
		
		//i = 1;  1 < 4
		//temp = 3
		//j = 1
//		-------------------
//		1 > 0 && 4 > 3 --> 4, 4, 2, 1 ----> 3, 4, 2, 1
		
		//i = 2;  2 < 4
		//temp = 2
		//j = 2
//		-------------------
//		2 > 0 && 4 > 2 --> 3, 4, 4, 1 ----> 2, 3, 4, 1
		
		//i = 3;  3 < 4
		//temp = 1
		//j = 3
//		-------------------
//		3 > 0 && 4 > 1 --> 2, 3, 4, 4 ----> 1, 2, 3, 4, 
		
		System.out.println("Before Sorting :");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		for(int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i; 
			
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			
			arr[j] = temp;
			
		}
		
		
		System.out.println();
		System.out.println("After Sorting :");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
