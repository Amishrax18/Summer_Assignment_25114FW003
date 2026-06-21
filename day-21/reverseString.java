public class reverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";

        // Reverse the string using a loop
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed String: " + rev);
    }
}