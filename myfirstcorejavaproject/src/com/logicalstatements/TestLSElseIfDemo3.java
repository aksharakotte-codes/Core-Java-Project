package com.logicalstatements;
//if-else if-else Ladder (or) else-if Statement
import java.util.Scanner;

public class TestLSElseIfDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Signal Color: ");
		String signal = sc.nextLine();
		
		if (signal.equals("red")) {
		    System.out.println("If the signal is red,Stop");
		} else if (signal.equals("yellow")) {
		    System.out.println("If the signal is red,Get Ready");
		} else if (signal.equals("green")) {
		    System.out.println("If the signal is red,Go");
		} else {
		    System.out.println("Invalid Signal!!!");
		}
		sc.close();
		System.out.println("Main Method Ended!!");

	}

}
