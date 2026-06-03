import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, lcm;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        lcm = (a > b) ? a : b;

        // Find LCM
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}