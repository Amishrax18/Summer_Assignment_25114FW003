import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        // Generate Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b; // Calculate next term
            a = b;
            b = c;
        }

        sc.close();
    }
}