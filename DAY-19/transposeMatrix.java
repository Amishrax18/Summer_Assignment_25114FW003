import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print transpose of matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}