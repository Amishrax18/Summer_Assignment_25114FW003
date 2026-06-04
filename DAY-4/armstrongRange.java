import java.util.Scanner;

public class armstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // Print Armstrong numbers in the given range
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(i).length();

            while (num > 0) {
                int digit = num % 10;
                sum += (int) Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }

        sc.close();
    }
}