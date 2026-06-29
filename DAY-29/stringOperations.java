
import java.util.Scanner;

public class stringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n----- STRING MENU -----");
            System.out.println("1. Display Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Display string length
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    // Convert to uppercase
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    // Reverse the string
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }
                    System.out.println("Reversed String = " + reverse);
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