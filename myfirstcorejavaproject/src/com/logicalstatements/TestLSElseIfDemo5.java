package com.logicalstatements;
//if-else if-else Ladder (or) else-if Statement
import java.util.Scanner;

public class TestLSElseIfDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String correctUsername = "Akshara";
        String correctPassword = "12345";

        
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else if (username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("Wrong password");
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}