package com.logicalstatements;

import java.util.Scanner;

public class ExampleSwitchDemo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Vcube Market");
        System.out.println("Categories: veggies / fruits");
        System.out.print("Enter category: ");

        String category = sc.next();
        int price = 0;
        String itemName = "";

        switch (category.toLowerCase()) {

            case "veggies" -> {
                System.out.println("Enter item code (tmt, ptt, on): ");
                String item = sc.next();

                switch (item) {
                    case "tmt" ->
                        { 
                    	    itemName = "Tomato"; price = 20; 
                    	}
                    case "ptt" ->
                        { 
                    	    itemName = "Potato"; price = 40;
                    	}
                    case "on"  ->
                        {
                    	    itemName = "Onion";  price = 30;     
                        }
                    default -> System.out.println("Invalid vegetable item");
                }
            }

            case "fruits" -> {
                System.out.println("Enter item code (mng, org, apl): ");
                String item = sc.next();

                switch (item) {
                    case "mng" ->
                        { 
                        	itemName = "Mango";  price = 300; 
                        }
                    case "org" -> 
                        { 
                        	itemName = "Orange"; price = 200;
                        }
                    case "apl" -> 
                        {
                        	itemName = "Apple";  price = 250; 
                        }
                    default -> System.out.println("Invalid fruit item");
                }
            }

            default -> System.out.println("Invalid category");
        }

        if (price > 0) {
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            int total = price * qty;

            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + qty);
            System.out.println("Total Price: ₹" + total);
        }

        sc.close();
    }
}