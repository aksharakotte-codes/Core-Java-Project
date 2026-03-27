package com.logicalstatements;

import java.util.Scanner;

public class TestLSSwitchDemo6 {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		System.out.println("Welcome to Vcube Vegetable & Fruits Market");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Category : ");
		
		
		String catg = sc.next();
		
		switch(catg) {
		case "veggies" -> {
			System.out.println("Enter a Item for Vegetables: ");
			String item = sc.next();
			
			switch(item) {
			case "tmt" -> System.out.println("Tomato & price is 20rs Per Kg");
			case "ptt" -> System.out.println("Potato & price is 40rs Per Kg");
			case "dmst" -> System.out.println("Drumsticks & price is 100rs Per Kg");
			case "on" -> System.out.println("Onion & price is 30rs Per Kg");
			case "cr" -> System.out.println("Carrot & price is 50rs Per Kg");
			case "bt" -> System.out.println("Beetroot & price is 45rs Per Kg");
			case "cbg" -> System.out.println("Cabbage & price is 25rs Per Kg");
			case "clf" -> System.out.println("Cauliflower & price is 60rs Per Kg");
			case "cuc" -> System.out.println("Cucumber & price is 20rs Per Kg");
			case "brj" -> System.out.println("Brinjal & price is 15rs Per Kg");
			case "sph" -> System.out.println("Spinach & price is 80rs Per Kg");
			default -> System.out.println("Entered Item is not Avaiable");
			}
			
		}
		case "fruits" -> {
			System.out.println("Enter a Item for Fruits: ");
			String item = sc.next();
			
			switch(item) {
			case "mng" -> System.out.println("Mango & the price is 300 per kg");
			case "org" -> System.out.println("Orange & the price is 200 per kg");
			
			case "apl" -> System.out.println("Apple & the price is 250 per kg");
		    case "ban" -> System.out.println("Banana & the price is 60 per dozen");
		    case "grf" -> System.out.println("Grapes & the price is 180 per kg");
		    case "pin" -> System.out.println("Pineapple & the price is 90 each");
		    case "wat" -> System.out.println("Watermelon & the price is 40 per kg");
		    case "pap" -> System.out.println("Papaya & the price is 70 per kg");
		    case "str" -> System.out.println("Strawberry & the price is 350 per kg");
		    case "pom" -> System.out.println("Pomegranate & the price is 220 per kg");
		    case "kiw" -> System.out.println("Kiwi & the price is 500 per kg");
		    case "mus" -> System.out.println("Muskmelon & the price is 50 per kg");
		    default -> System.out.println("Entered Item is not Avaiable");
			}
		}
		default -> System.out.println("Entered Category is Invalid");
		
		}
		
		sc.close();
	}

}
