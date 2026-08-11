package com.project1;

import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Which keyword is used to inherit a class in Java?",
            "Which method is the entry point of Java?",
            "Which collection does not allow duplicate elements?",
            "Which keyword is used to create an object?"
        };

        String[][] options = {
            {"A. implements", "B. extends", "C. inherits", "D. super"},
            {"A. start()", "B. run()", "C. main()", "D. execute()"},
            {"A. List", "B. ArrayList", "C. Set", "D. Map"},
            {"A. class", "B. new", "C. object", "D. create"}
        };

        char[] answers = {'B', 'C', 'C', 'B'};

        int score = 0;

        System.out.println("===== JAVA QUIZ =====");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);

            for (String option : options[i])
                System.out.println(option);

            System.out.print("Enter answer: ");
            char answer =
                Character.toUpperCase(sc.next().charAt(0));

            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + questions.length);

        double percentage =
            (score * 100.0) / questions.length;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75)
            System.out.println("Excellent!");
        else if (percentage >= 50)
            System.out.println("Good!");
        else
            System.out.println("Need more practice.");
    }
}