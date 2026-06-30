import java.util.Scanner;

public class miniEmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        double[] salaries = new double[3];

        // Input employee details
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Employee Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Display employee details
        System.out.println("\n----- Employee Records -----");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] + ", Salary: ₹" + salaries[i]);
        }

        sc.close();
    }
}