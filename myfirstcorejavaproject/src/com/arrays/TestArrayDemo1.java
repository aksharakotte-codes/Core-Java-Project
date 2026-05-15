package com.arrays;

public class TestArrayDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		//Declaration
		int[] ages;
		
		//Creation
//		Variable must provide either dimension expressions or an array initializer
//		ages = new int[];//invalid
		ages = new int[5];//0 1 2 3 4
		
//		Initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 22;
		ages[4] = 24;
		
//		Representation
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
		
//		Representation with for loop		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
	
		System.out.println("Main Method Ended");
	}

}
