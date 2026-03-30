package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchYieldDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Signal color :");
	    String signals = sc.nextLine();
		
		String result = switch(signals) {
		
		case "Red" -> {
			yield "Stop";
		}
		case "Yellow" -> {
			yield "Ready To Go";
		}
		case "Green" -> {
			yield "Go";
		}
		default -> {
			yield "No Instructions for other colors";
		}
		};
		
		System.out.println("Printing warning Messages for Traffic Signals is : " + result);
		sc.close();
	}

}
