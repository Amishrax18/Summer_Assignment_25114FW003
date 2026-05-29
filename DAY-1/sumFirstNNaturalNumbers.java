import java.util.Scanner;

public class sumFirstNNaturalNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        long sumLoop = 0;
        for (int i = 1; i <= n; i++) sumLoop += i;
        System.out.println("Sum (Loop):    " + sumLoop);
        sc.close();

    }
}
