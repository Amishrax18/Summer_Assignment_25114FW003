import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end;

        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        // Print prime numbers in the given range
        for (int n = start; n <= end; n++) {
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}