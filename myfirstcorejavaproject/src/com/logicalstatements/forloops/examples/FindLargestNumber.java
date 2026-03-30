package com.logicalstatements.forloops.examples;

//WAP TO Print numbers divisible by 5 (1–50)
public class FindLargestNumber {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
       
        int max = 0;
		for(int i = 1; i <= 10; i++) {
			if(i > max) {
				max = i;
			}
		} 
		System.out.println("Largest number from 1 to 10: " + max);
		System.out.println("Main Method Ended!!");

	}

}
