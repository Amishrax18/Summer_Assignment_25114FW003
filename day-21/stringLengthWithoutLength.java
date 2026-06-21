public class stringLengthWithoutLength {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        // Count each character in the string
        for (char ch : str.toCharArray()) {
            count++;
        }

        // Display the length of the string
        System.out.println("Length = " + count);
    }
}