package com.logicalstatements.forloops.examples;

//WAP TO Print numbers divisible by 10 (1–100)
public class NumbersDivisibleBy10 {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
        System.out.println("Print numbers divisible by 10 : " );
		for(int i = 1; i <= 100; i++) {
			if(i %  10 ==  0) {
				System.out.println(i);
			}
		} 
		System.out.println("Main Method Ended!!");

	}

}
