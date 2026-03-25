package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchDemo1 {

	public static void main(String[] args) {
		System.out.println("Enter a number (1–7) for the day of the week");
		Scanner sc = new Scanner(System.in);
		
		int noOfWeekDays = sc.nextInt();
		switch(noOfWeekDays) {
		case 1 :
			System.out.println("It is a Monday");
			System.out.println("Its a Lazy Day");
			break;
		case 2 :
			System.out.println("It is a Tuesday");
			System.out.println("Its a Fun Day");
			break;
		case 3 :
			System.out.println("It is a Wednesday");
			System.out.println("Its a Moody Day");
			break;
		case 4 :
			System.out.println("It is a Thursday");
			System.out.println("Its a Normal Day");
			break;
		case 5 :
			System.out.println("It is a Friday");
			System.out.println("Its a Studying for Weekend exam Day");
			break;
		case 6 :
			System.out.println("It is a Saturday");
			System.out.println("Its a Weekend Exam Day");
			break;
		case 7 :
			System.out.println("It is a Sunday");
			System.out.println("Awwww !!! It's a Holiday");
			break;
		default :
			System.out.println("No Other days in Week !!");
			break;
		}
		sc.close();
	}

}
