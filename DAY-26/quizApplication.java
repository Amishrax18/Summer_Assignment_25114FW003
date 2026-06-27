import java.util.Scanner;

public class quizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Q1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. New Delhi");
        System.out.println("3. Kolkata");
        System.out.print("Enter your answer: ");
        int ans = sc.nextInt();

        if (ans == 2)
            score++;

        // Question 2
        System.out.println("\nQ2. Which language is used for Java programming?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 1)
            score++;

        // Display score
        System.out.println("\nYour Score: " + score + "/2");

        sc.close();
    }
}