package com.project1;

import java.util.ArrayList;
import java.util.Scanner;

class Expense {

    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    void display() {
        System.out.println(
            "Category: " + category +
            " | Amount: ₹" + amount
        );
    }
}

public class ExpenseTracker {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {

            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Highest Expense");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(
                        new Expense(category, amount)
                    );

                    System.out.println("Expense added.");
                    break;

                case 2:

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses.");
                    } else {

                        for (Expense e : expenses)
                            e.display();
                    }

                    break;

                case 3:

                    double total = 0;

                    for (Expense e : expenses)
                        total += e.amount;

                    System.out.println(
                        "Total Expense: ₹" + total
                    );

                    break;

                case 4:

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses.");
                    } else {

                        Expense highest = expenses.get(0);

                        for (Expense e : expenses) {
                            if (e.amount > highest.amount)
                                highest = e;
                        }

                        System.out.println("Highest Expense:");
                        highest.display();
                    }

                    break;

                case 5:
                    System.out.println("Thank you for using Expense Tracker!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}