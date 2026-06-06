import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        int decimal = 0, power = 0;

        // Convert binary to decimal
        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}