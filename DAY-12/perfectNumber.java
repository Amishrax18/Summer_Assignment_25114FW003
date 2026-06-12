public class perfectNumber {

    // Function to check whether a number is perfect or not
    static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;

        // Calling the function and displaying result
        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }
    }
}