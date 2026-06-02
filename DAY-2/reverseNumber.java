import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, rev = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Reverse the number
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        System.out.println("Reversed number = " + rev);

        sc.close();
    }
}