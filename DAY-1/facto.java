import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        long fact = 1;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);

        sc.close();
    }
}