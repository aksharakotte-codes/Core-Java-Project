package com.logicalstatements.forloops.examples;

//WAP TO Print numbers divisible by 5 (1–50)
public class NumbersDivisibleBy5 {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
        System.out.println("Print numbers divisible by 5 : " );
		for(int i = 1; i <= 50; i++) {
			if(i %  5 ==  0) {
				System.out.println(i);
			}
		} 
		System.out.println("Main Method Ended!!");

	}

}
