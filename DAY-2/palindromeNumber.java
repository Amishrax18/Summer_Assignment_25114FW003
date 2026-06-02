import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, temp, rev = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        // Reverse the number
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}