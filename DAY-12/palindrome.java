public class palindrome {

    // Function to check whether a number is palindrome or not
    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int number = 121;

        // Calling the function and displaying result
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }
    }
}