package com.arrays;

//Jagged Array : Array of Arrays
public class JaggedArray {
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int[][] arr= new int[2][];//0 1
		
		arr[0] = new int[]{3, 4};///0 1 2
		arr[1] = new int[]{6, 7, 8};//0 1 2 
		
		//00 01 02
		//10 11 12
		
		 for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	     }
		
	}	
}

