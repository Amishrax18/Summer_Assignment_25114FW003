import java.util.Scanner;

public class ProductOf_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, product = 1;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Calculate product of digits
        while (num != 0) {
            product = product * (num % 10);
            num = num / 10;
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}

