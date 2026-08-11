package com.project1;
//E-Commerce Shopping Application

import java.util.ArrayList;
import java.util.Scanner;

class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + ". " + name + " - ₹" + price);
    }
}

public class ShoppingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> cart = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Mobile", 20000));
        products.add(new Product(3, "Headphones", 2000));
        products.add(new Product(4, "Keyboard", 1500));

        while (true) {

            System.out.println("\n===== SHOPPING APPLICATION =====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Product p : products)
                        p.display();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    for (Product p : products) {
                        if (p.id == id) {
                            cart.add(p);
                            System.out.println("Product added to cart.");
                        }
                    }
                    break;

                case 3:

                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {

                        double total = 0;

                        for (Product p : cart) {
                            p.display();
                            total += p.price;
                        }

                        System.out.println("Total: ₹" + total);
                    }

                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();

                    for (Product p : cart) {
                        if (p.id == removeId) {
                            cart.remove(p);
                            System.out.println("Removed from cart.");
                            break;
                        }
                    }
                    break;

                case 5:

                    double total = 0;

                    for (Product p : cart)
                        total += p.price;

                    double discount = 0;

                    if (total >= 50000)
                        discount = total * 0.10;

                    double finalAmount = total - discount;

                    System.out.println("Total: ₹" + total);
                    System.out.println("Discount: ₹" + discount);
                    System.out.println("Final Amount: ₹" + finalAmount);
                    System.out.println("Order placed successfully.");

                    cart.clear();
                    break;

                case 6:
                	System.out.println("Thank you for using E-Commerce Shopping Application");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            sc.close();
        }
    }
}