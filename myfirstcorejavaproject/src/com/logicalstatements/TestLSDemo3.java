package com.logicalstatements;
// if else statements with && (AND) Operators
import java.util.Scanner;

public class TestLSDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Attending classes regularly :" );
		boolean areYouAttendingClassRegularly = sc.nextBoolean();
		
		System.out.println("Are you Attending weekly test"
				+ ""
				+ "s regularly :" );
		boolean areYouAttendingWeeklyTest = sc.nextBoolean();
		
		if(areYouAttendingClassRegularly && areYouAttendingWeeklyTest) {
			System.out.println("You will understand the classes properly and you will get a job !!");
		} else {
			System.out.println("You will not  understand classes and you will get a job");
		}
		
		sc.close();
	}

}
