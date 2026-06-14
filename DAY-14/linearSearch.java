import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = -1;

        // Linear search through the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");

        sc.close();
    }
}