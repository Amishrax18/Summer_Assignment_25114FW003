public class firstRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        // Find the first repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println("First repeating character: " + ch);
                break;
            }
        }
    }
}