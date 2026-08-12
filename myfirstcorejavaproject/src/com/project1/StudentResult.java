package com.project1;
//Student Result System

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter SQL Marks: ");
        int sql = sc.nextInt();

        System.out.print("Enter HTML Marks: ");
        int html = sc.nextInt();

        System.out.print("Enter Python Marks: ");
        int python = sc.nextInt();

        int total = java + sql + html + python;

        double percentage = total / 4.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 75)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else
            grade = "F";

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total + "/400");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (percentage >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}

/*Output :
Java       = 85
SQL        = 87
HTML       = 90
Python     = 82
----------------
Total      = 344 / 400

Percentage = 344 / 4
           = 86.0%

Grade      = A
Result     = PASS */