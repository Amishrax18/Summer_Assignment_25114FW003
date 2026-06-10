public class reverseNumberTriangle {
    public static void main(String[] args) {

        // Outer loop controls rows
        for (int i = 5; i >= 1; i--) {

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}