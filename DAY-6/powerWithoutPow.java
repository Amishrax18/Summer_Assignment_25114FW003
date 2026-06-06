import java.util.Scanner;

public class powerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = 1;

        // Calculate x^n using loop
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}