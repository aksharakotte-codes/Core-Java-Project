package com.arrays;

public class Array2D {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int[][] arr = new int[3][4];//rows--> 0 1 2 and columns--> 0 1 2 3
		 
		System.out.println(arr.length);//3
		System.out.println(arr[1].length);//4
		
		//00 01 02 03
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Main Method Ended");
	}

}
