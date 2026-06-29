import java.util.Scanner;

public class inventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input product details
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        double totalValue = quantity * price;

        // Display inventory details
        System.out.println("\n----- Inventory Details -----");
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : ₹" + price);
        System.out.println("Total Value  : ₹" + totalValue);

        sc.close();
    }
}