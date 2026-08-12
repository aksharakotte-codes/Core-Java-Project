package com.project1;
//Digital Wallet
import java.util.Scanner;

public class DigitalWallet {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        double balance = 5000;

        while (true) {

            System.out.println("\n===== DIGITAL WALLET =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Add Money");
            System.out.println("3. Send Money");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println(
                        "Balance: ₹" + balance
                    );
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double add = sc.nextDouble();

                    if (add > 0) {
                        balance += add;
                        System.out.println("Money added.");
                    } else {
                        System.out.println("Invalid amount.");
                    }

                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double send = sc.nextDouble();

                    if (send > balance) {
                        System.out.println("Insufficient balance.");
                    } else if (send <= 0) {
                        System.out.println("Invalid amount.");
                    } else {
                        balance -= send;
                        System.out.println("Money sent successfully.");
                    }

                    break;

                case 4:
                	System.out.println("Thank You for using Digital Wallet");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}