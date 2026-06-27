import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;

        // Keep asking until the correct number is guessed
        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Correct! You guessed the number.");
        } while (guess != number);

        sc.close();
    }
}