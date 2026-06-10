public class repeatedCharacterPattern {
    public static void main(String[] args) {

        // Outer loop for rows
        for (char ch = 'A'; ch <= 'E'; ch++) {

            // Print the same character multiple times
            for (char j = 'A'; j <= ch; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}