package com.logicalstatements;

import java.util.Scanner;

public class TestLSSwitchYieldDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your marks Percentage ");
	    int marksP = sc.nextInt();
	    
	    String result = switch (marksP / 10) {
	    
	    case 10, 9 -> {
	    	yield "Excellent";
	    	
	    }
	    
	    case 8 -> {
	    	yield "Very Good";
	    }
	    case 7 -> {
	    	yield "Good";
	    }
	    case 6 -> {
	    	yield "Average";
	    }
	    case 5 -> {
	    	yield "Pass";
	    }
	    default -> {
	    	yield "Fail";
	    }
	    };
	    System.out.println("Result : " + result);
	    sc.close();
	}

}
