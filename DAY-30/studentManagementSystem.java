import java.util.Scanner;

public class studentManagementSystem {

    // Display all student records
    static void display(String[] names, int[] marks, int n) {
        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]);
        }
    }

    // Find topper
    static void topper(String[] names, int[] marks, int n) {
        int max = marks[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }

        System.out.println("Topper: " + names[index] + " (" + max + " marks)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        int[] marks = new int[3];

        // Input student details
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        // Display records and topper
        display(names, marks, 3);
        topper(names, marks, 3);

        sc.close();
    }
}