import java.util.Scanner;

public class arrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input array elements
        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Maximum");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Display array
                    System.out.print("Array Elements: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    // Calculate sum
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    // Find maximum
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max)
                            max = num;
                    }
                    System.out.println("Maximum = " + max);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}