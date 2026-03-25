package com.logicalstatements;
//if-else if-else Ladder (or) else-if Statement
import java.util.Scanner;

public class TestLSElseIfDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks Percentage : ");
		int marksP = sc.nextInt();
		
		if (marksP >= 90) {
		    System.out.println("Grade A");
		} else if (marksP >= 75) {
		    System.out.println("Grade B");
		} else if (marksP >= 60) {
		    System.out.println("Grade C");
		} else if (marksP >= 35) {
			System.out.println("Grade D");
		} else {
		    System.out.println("Failed !!");
		}
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
