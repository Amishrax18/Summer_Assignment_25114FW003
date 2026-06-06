import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        // Count number of 1s in binary representation
        while (n > 0) {
            count += n % 2;
            n /= 2;
        }

        System.out.println("Set Bits = " + count);

        sc.close();
    }
}