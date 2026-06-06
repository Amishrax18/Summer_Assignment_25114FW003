import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String binary = "";

        // Convert decimal to binary
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}