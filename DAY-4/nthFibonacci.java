import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        // Find nth Fibonacci term
        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Nth Fibonacci term = " + a);

        sc.close();
    }
}