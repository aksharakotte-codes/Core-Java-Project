package com.project1;
//Parking Management System

import java.util.Scanner;

public class ParkingSystem {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        int cars = 0;
        int bikes = 0;

        while (true) {

            System.out.println("\n===== PARKING SYSTEM =====");
            System.out.println("1. Park Car");
            System.out.println("2. Park Bike");
            System.out.println("3. View Vehicles");
            System.out.println("4. Remove Car");
            System.out.println("5. Remove Bike");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    cars++;
                    System.out.println("Car parked.");
                    break;

                case 2:
                    bikes++;
                    System.out.println("Bike parked.");
                    break;

                case 3:
                    System.out.println("Cars: " + cars);
                    System.out.println("Bikes: " + bikes);
                    break;

                case 4:
                    if (cars > 0) {
                        cars--;
                        System.out.println("Car removed.");
                    } else {
                        System.out.println("No cars available.");
                    }
                    break;

                case 5:
                    if (bikes > 0) {
                        bikes--;
                        System.out.println("Bike removed.");
                    } else {
                        System.out.println("No bikes available.");
                    }
                    break;

                case 6:
                	System.out.println("Thank you for Parking Management System");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}