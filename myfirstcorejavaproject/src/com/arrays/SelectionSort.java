package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		int[] arr = { 45, 18, 9, 7, 8, 1, 4 };
		System.out.println(arr.length);
		int temp = 0;
		
        System.out.println("Before Sorting :");
		
		for (int a : arr) {
            System.out.print(a + " ");
        }

		
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;//index 0
			
			for(int j = i + 1; j < arr.length; j++) {//i+1 = 18
				if(arr[j] < arr[minIndex]) { //if 18 less than 45 then j is stored in minIndex
					minIndex = j;//index 1 -> 2 -> 3 ->5 
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println();
		System.out.println("After Sorting :");
		
		for (int a : arr) {
            System.out.print(a + " ");
        }

	}

}
