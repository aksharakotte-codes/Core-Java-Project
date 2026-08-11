package com.project1;

import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN.");
            return;
        }

        while (true) {

            System.out.println("\n========== ATM ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 4:
                    System.out.print("Enter new PIN: ");
                    pin = sc.nextInt();
                    System.out.println("PIN changed successfully.");
                    break;

                case 5:
                    System.out.println("Thank you.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}