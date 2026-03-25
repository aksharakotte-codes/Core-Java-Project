package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Option Number in Restaurant");
		int food = sc.nextInt();
		
		switch(food) {
		case 1 -> System.out.println("Pizza");
		case 2 -> System.out.println("Burger");
		case 3 -> System.out.println("Pasta");
		case 4 -> System.out.println("Chicken Biryani");
		case 5 -> System.out.println("Chicken Lollipops");
		default -> System.out.println("Selected Option is not available in Restaurant");
		
		}
		sc.close();
	}

} 