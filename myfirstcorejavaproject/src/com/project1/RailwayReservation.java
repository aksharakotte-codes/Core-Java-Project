package com.project1;

import java.util.Scanner;

public class RailwayReservation {

    static int availableSeats = 10;

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== RAILWAY RESERVATION =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println(
                        "Available Seats: " + availableSeats
                    );
                    break;

                case 2:

                    if (availableSeats > 0) {

                        sc.nextLine();

                        System.out.print("Passenger Name: ");
                        String name = sc.nextLine();

                        System.out.print("Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter number of tickets: ");
                        int tickets = sc.nextInt();

                        if (tickets <= availableSeats) {

                            double fare = tickets * 500;

                            availableSeats -= tickets;

                            System.out.println("\nTicket Booked!");
                            System.out.println("Passenger: " + name);
                            System.out.println("Age: " + age);
                            System.out.println("Tickets: " + tickets);
                            System.out.println("Fare: ₹" + fare);

                        } else {
                            System.out.println("Not enough seats.");
                        }

                    } else {
                        System.out.println("No seats available.");
                    }

                    break;

                case 3:

                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();

                    availableSeats += cancel;

                    System.out.println("Ticket cancelled.");

                    break;

                case 4:
                	System.out.println("Thank you for using Railway Ticket Reservation");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}