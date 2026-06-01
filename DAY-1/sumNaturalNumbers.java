import java.util.Scanner;

public class sumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, Sum = 0;

        System.out.print("Enter N: ");
        n = sc.nextInt();

        // Calculate sum of first N natural numbers
        for (int i = 1; i <= n; i++) {
            Sum += i;
        }

        System.out.println("Sum = " + Sum);

        sc.close();
    }
}