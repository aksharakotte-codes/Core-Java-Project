package com.project1;
//Movie Ticket Booking

import java.util.Scanner;

public class MovieBooking {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        int seats = 50;

        while (true) {

            System.out.println("\n===== MOVIE BOOKING =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println(
                        "Available Seats: " + seats
                    );
                    break;

                case 2:

                    System.out.print("Enter number of tickets: ");
                    int tickets = sc.nextInt();

                    if (tickets <= seats) {

                        seats -= tickets;

                        System.out.println(
                            "Tickets booked successfully."
                        );

                        System.out.println(
                            "Total Amount: ₹" + tickets * 200
                        );

                    } else {
                        System.out.println("Not enough seats.");
                    }

                    break;

                case 3:

                    System.out.print("Enter tickets to cancel: ");
                    int cancel = sc.nextInt();

                    seats += cancel;

                    System.out.println("Tickets cancelled.");
                    break;

                case 4:
                	System.out.println("Thank you for using Movie Ticket Booking");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}