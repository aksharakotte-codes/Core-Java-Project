package com.arrays;

public class Dimen2Array1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int[][] numbers = new int[2][3];//rows--> 0 1  and columns--> 0 1 2 
		 
		System.out.println(numbers.length);//2
		System.out.println(numbers[0].length);//3
		System.out.println(numbers[1].length);//3
		System.out.println("*****************");
		
		numbers[0][0] = 101;
		numbers[0][1] = 102;
		numbers[0][2] = 103;
		
		numbers[1][0] = 104;
		numbers[1][1] = 105;
		numbers[1][2] = 106;
		
		for(int i =  0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}	
		
}
