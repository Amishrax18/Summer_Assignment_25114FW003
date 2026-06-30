import java.util.Scanner;

public class studentrecordSystem {
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

        // Display student records
        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
        }

        sc.close();
    }
}