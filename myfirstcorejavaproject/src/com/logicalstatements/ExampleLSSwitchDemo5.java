package com.logicalstatements;

import java.util.Scanner;

public class ExampleLSSwitchDemo5 {

	public static void main(String[] args) {
	    System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day"
				+ " Number");
		int day = sc.nextInt();
		
		switch (day) {
	    case 1 -> {
	        System.out.println("Start of the week");
	        System.out.println("Monday");
	    }
	    case 2 -> {
	        System.out.println("Second day");
	        System.out.println("Tuesday");
	    }
	    default -> {
	        System.out.println("Invalid day");
	    }
	    }
	sc.close();
	}

}
