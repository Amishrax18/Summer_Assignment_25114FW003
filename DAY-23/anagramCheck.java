import java.util.Arrays;

public class anagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to character arrays and sort them
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        // Check if both sorted arrays are equal
        if (Arrays.equals(a, b))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are Not Anagrams");
    }
}