package com.project1;

import java.util.Scanner;

public class RestaurantBilling {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        double total = 0;

        while (true) {

            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("1. Pizza      - ₹250");
            System.out.println("2. Burger     - ₹150");
            System.out.println("3. Biryani    - ₹200");
            System.out.println("4. Coke       - ₹50");
            System.out.println("5. Generate Bill");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter quantity: ");
                    int pizza = sc.nextInt();
                    total += pizza * 250;
                    System.out.println("Pizza added.");
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    int burger = sc.nextInt();
                    total += burger * 150;
                    System.out.println("Burger added.");
                    break;

                case 3:
                    System.out.print("Enter quantity: ");
                    int biryani = sc.nextInt();
                    total += biryani * 200;
                    System.out.println("Biryani added.");
                    break;

                case 4:
                    System.out.print("Enter quantity: ");
                    int coke = sc.nextInt();
                    total += coke * 50;
                    System.out.println("Coke added.");
                    break;

                case 5:
                    double gst = total * 0.05;
                    double finalBill = total + gst;

                    System.out.println("\n===== BILL =====");
                    System.out.println("Total: ₹" + total);
                    System.out.println("GST: ₹" + gst);
                    System.out.println("Final Bill: ₹" + finalBill);

                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}