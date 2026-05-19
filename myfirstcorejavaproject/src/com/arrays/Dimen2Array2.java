package com.arrays;

public class Dimen2Array2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int[][] numbers = {{10, 20, 30}, {40, 50, 60},{70, 80, 90}};
		System.out.println(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
//		for (int[] n1 : numbers) {
//			for(int num : n1) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}

	}

}
