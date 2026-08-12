package com.project1;
//Electricity Bill Calculator

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
        } else if (units <= 300) {
            bill = 100 * 2 + 100 * 3 +
                   (units - 200) * 5;
        } else {
            bill = 100 * 2 + 100 * 3 +
                   100 * 5 + (units - 300) * 7;
        }

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Consumer: " + name);
        System.out.println("Units: " + units);
        System.out.println("Bill Amount: ₹" + bill);
        sc.close();
    }
}