public class armstrong {

    // Function to check whether a number is Armstrong or not
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int number = 153;

        // Calling the function and displaying result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}