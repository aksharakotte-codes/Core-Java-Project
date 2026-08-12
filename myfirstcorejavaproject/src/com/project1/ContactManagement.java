package com.project1;

import java.util.*;

class Contact {
    int id;
    String name;
    String phone;

    Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + phone);
    }
}

public class ContactManagement {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n===== CONTACT MANAGEMENT =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    contacts.add(new Contact(id, name, phone));

                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        for (Contact c : contacts)
                            c.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.id == searchId) {
                            c.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact not found.");

                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).id == deleteId) {
                            contacts.remove(i);
                            System.out.println("Contact deleted.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}