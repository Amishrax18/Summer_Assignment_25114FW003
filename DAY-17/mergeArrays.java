import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements of first array
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements of second array
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Display merged array
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}