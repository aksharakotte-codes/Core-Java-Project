package com.logicalstatements.forloops.examples;

public class PrintMultiplesof3upto30 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
        System.out.println("Print multiples by 3 : " );
		for(int i = 1; i <= 30; i++) {
			if(i %  3 ==  0) {
				System.out.println(i);
			}
		} 
		System.out.println("Main Method Ended!!");

	}

}
