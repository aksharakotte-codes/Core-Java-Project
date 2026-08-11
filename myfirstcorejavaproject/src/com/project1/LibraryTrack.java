package com.project1;
//Library Management System

import java.util.ArrayList;
import java.util.Scanner;

class Book {

    int id;
    String title;
    String author;
    boolean issued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void display() {
        System.out.println(
            id + " | " +
            title + " | " +
            author + " | " +
            (issued ? "Issued" : "Available")
        );
    }
}

public class LibraryTrack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");

            // Input validation for menu choice
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number from 1 to 6.");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Book ID must be a number.");
                        sc.nextLine();
                        break;
                    }

                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {

                        System.out.println("\n===== BOOK LIST =====");

                        for (Book b : books) {
                            b.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to search: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Book ID must be a number.");
                        sc.nextLine();
                        break;
                    }

                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {

                        if (b.id == searchId) {

                            System.out.println("\nBook Found:");
                            b.display();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to issue: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Book ID must be a number.");
                        sc.nextLine();
                        break;
                    }

                    int issueId = sc.nextInt();

                    found = false;

                    for (Book b : books) {

                        if (b.id == issueId) {

                            found = true;

                            if (b.issued) {
                                System.out.println("Book is already issued.");
                            } else {
                                b.issued = true;
                                System.out.println("Book issued successfully.");
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID to return: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Book ID must be a number.");
                        sc.nextLine();
                        break;
                    }

                    int returnId = sc.nextInt();

                    found = false;

                    for (Book b : books) {

                        if (b.id == returnId) {

                            found = true;

                            if (b.issued) {
                                b.issued = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 6:

                    System.out.println("Thank you for using Library Management System.");

                    // Do not close Scanner inside the loop
                    return;

                default:

                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a number between 1 and 6.");
            }
            sc.close();
        }
    }
}