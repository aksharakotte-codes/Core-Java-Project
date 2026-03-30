package com.logicalstatements.forloops.examples;

public class PrintMultiplesof5upto50 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
        System.out.println("Print multiples  by 5 : " );
		for(int i = 1; i <= 50; i++) {
			if(i %  5 ==  0) {
				System.out.println(i);
			}
		} 
		System.out.println("Main Method Ended!!");

	}

}
