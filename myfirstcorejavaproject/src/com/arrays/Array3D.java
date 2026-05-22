package com.arrays;

public class Array3D {

	public static void main(String[] args) {
		int[][][] arr = {{{10, 20, 30},{40, 50, 60},{70, 80, 90}},{{1, 2, 3},{4, 5, 6},{7, 8, 9}},{{10, 11, 12},{13, 14, 15},{16, 17, 18}}};
		System.out.println(arr);
		
		for(int[][] arr2:arr) {
			for(int[] arr1:arr2) {
				
				for(int n:arr1) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
