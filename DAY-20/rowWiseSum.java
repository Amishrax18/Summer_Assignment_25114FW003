public class rowWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate and print sum of each row
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            // Display row-wise sum
            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}