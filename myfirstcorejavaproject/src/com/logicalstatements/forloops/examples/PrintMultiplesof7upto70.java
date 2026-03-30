package com.logicalstatements.forloops.examples;

public class PrintMultiplesof7upto70 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
        System.out.println("Print multiples  by 7 : " );
		for(int i = 1; i <= 70; i++) {
			if(i %  7 ==  0) {
				System.out.println(i);
			}
		} 
		System.out.println("Main Method Ended!!");

	}

}
