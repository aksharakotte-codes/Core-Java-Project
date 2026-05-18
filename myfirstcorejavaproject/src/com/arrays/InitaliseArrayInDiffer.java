package com.arrays;

public class InitaliseArrayInDiffer {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		int[] numbers = {10};
		System.out.println(numbers);// prints address of the object --> [I@2b2fa4f7
		System.out.println(numbers[0]);// prints --> 10
		
		System.out.println("**********************************");
		
		int[] numbers1 = {11,20,35,40,55};
		for(int n : numbers1) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		}
	}

}
