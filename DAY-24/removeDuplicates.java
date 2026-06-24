public class removeDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        // Add character only if it is not already present
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}