package com.logicalstatements.forloops.examples;

import java.util.Scanner;
//Armstrong Number (Advanced Logic)

//(Example: 153 → 1³ + 5³ + 3³ = 153)
//Digits = 3
//Calculation:
//1³ = 1
//5³ = 125
//3³ = 27
//Sum = 1 + 125 + 27 = 153

public class ArmStrongNumber {

    public static void main(String[] args) {
        System.out.println("Main Method Started!!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int count = 0;
        int temp = n;

        // Step 1: Count digits
        for(; temp != 0; temp /= 10) {
            count++;
        }

        int sum = 0;
        temp = n;

        // Step 2: Process each digit
        for(; temp != 0; temp /= 10) {
            int digit = temp % 10;

            int power = 1;

            // Step 3: Calculate digit^count
            for(int i = 1; i <= count; i++) {
                power *= digit;
            }

            sum += power;
        }

        // Step 4: Compare
        if(sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
        System.out.println("Main Method Ended!!");
    }
}