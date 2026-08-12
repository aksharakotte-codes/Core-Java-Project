package com.project1;

import java.util.*;

class Task {
    int id;
    String task;
    boolean completed;

    Task(int id, String task) {
        this.id = id;
        this.task = task;
        this.completed = false;
    }

    void display() {
        System.out.println(
            id + ". " + task +
            " - " + (completed ? "Completed" : "Pending")
        );
    }
}

public class ToDoListApplication {

    public static void main(String[] args) {
    	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {

            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();

                    tasks.add(new Task(id, task));

                    System.out.println("Task added.");
                    break;

                case 2:
                    for (Task t : tasks)
                        t.display();
                    break;

                case 3:
                    System.out.print("Enter Task ID: ");
                    int completeId = sc.nextInt();

                    for (Task t : tasks) {
                        if (t.id == completeId) {
                            t.completed = true;
                            System.out.println("Task completed.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID: ");
                    int deleteId = sc.nextInt();

                    for (int i = 0; i < tasks.size(); i++) {
                        if (tasks.get(i).id == deleteId) {
                            tasks.remove(i);
                            System.out.println("Task deleted.");
                            break;
                        }
                    }
                    break;

                case 5:
                	System.out.println("Thank you for using To-Do list Application");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}