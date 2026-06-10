public class reverseStarPattern {
    public static void main(String[] args) {

        // Outer loop controls the number of rows
        for (int i = 5; i >= 1; i--) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}