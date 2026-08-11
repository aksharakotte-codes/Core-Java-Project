package com.project1;
//Employee Management System

import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(
            "ID: " + id +
            " | Name: " + name +
            " | Salary: " + salary
        );
    }
}

public class PeopleHub {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Highest Salary");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));

                    System.out.println("Employee added.");
                    break;

                case 2:
                    for (Employee e : employees)
                        e.display();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Employee e : employees) {
                        if (e.id == search) {
                            e.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found.");

                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int delete = sc.nextInt();

                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).id == delete) {
                            employees.remove(i);
                            System.out.println("Employee deleted.");
                            break;
                        }
                    }

                    break;

                case 5:
                    if (employees.isEmpty()) {
                        System.out.println("No employees.");
                    } else {

                        Employee highest = employees.get(0);

                        for (Employee e : employees) {
                            if (e.salary > highest.salary)
                                highest = e;
                        }

                        System.out.println("Highest Paid Employee:");
                        highest.display();
                    }

                    break;

                case 6:
                	System.out.println("Thank you for using Employee Management System.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            sc.close();
        }
    }
}