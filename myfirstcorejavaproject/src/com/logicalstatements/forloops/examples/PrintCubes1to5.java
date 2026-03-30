package com.logicalstatements.forloops.examples;
//Print cubes from 1 to 5
public class PrintCubes1to5 {

	public static void main(String[] args) {
        System.out.println("Main Method started!!");
		
		for(int i = 1; i <= 5; i++) {
			int cubes = i * i * i ;
			System.out.println("Cube of " + i + " = " + cubes);
	    }
		
		System.out.println("Main Method ended!!");

	}

}
