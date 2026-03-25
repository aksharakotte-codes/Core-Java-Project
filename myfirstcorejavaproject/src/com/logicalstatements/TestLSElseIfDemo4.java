package com.logicalstatements;

import java.util.Scanner;

//if-else if-else Ladder (or) else-if Statement
public class TestLSElseIfDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature : ");
		int temp = sc.nextInt();
		
		if (temp >= 40 ) {
		    System.out.println("If temperature is above 40°C,Very Hot");
		} else if (temp >= 30) {
		    System.out.println("If temperature is above 30°C, Hot");
		} else if (temp >= 20) {
		    System.out.println("If temperature is above 20°C,Warm");
		} else {
		    System.out.println("If temperature is below 20°C, Cold!!");
		}
		sc.close();
		System.out.println("Main Method Ended!!");

	}

}
