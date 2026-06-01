import java.util.Scanner;

public class count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Count digits
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}