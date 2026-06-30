import java.util.Scanner;

public class miniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++"};
        int choice;

        do {
            System.out.println("\n----- MINI LIBRARY -----");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // Perform library operations
            switch (choice) {
                case 1:
                    System.out.println("Available Books:");
                    for (String book : books) {
                        System.out.println(book);
                    }
                    break;

                case 2:
                    System.out.print("Enter book number (1-3): ");
                    int bookNo = sc.nextInt();

                    if (bookNo >= 1 && bookNo <= 3) {
                        System.out.println(books[bookNo - 1] + " issued successfully.");
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}