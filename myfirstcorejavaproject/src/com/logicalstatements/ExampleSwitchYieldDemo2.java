package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchYieldDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Month Number :");
	    String season = sc.nextLine();
		
		String result = switch(season) {
		
		case "Dec", "Jan", "Feb" -> {
			yield "Winter";
		}
		case "Mar", "Apr", "May" -> {
			yield "Summer";
		}
		case "June", "July", "August" -> {
			yield "Rainy";
		}
		case "Sep", "Oct", "Nov" -> {
			yield "Spring";
		}
		default -> {
			yield "Not Avaiable";
		}
		};
		
		System.out.println("Season is : " + result);
		sc.close();
	}

}
