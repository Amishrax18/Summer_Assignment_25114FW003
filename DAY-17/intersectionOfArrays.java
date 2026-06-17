import java.util.HashSet;

public class intersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Store elements of first array in set
        for (int num : arr1) {
            set.add(num);
        }

        // Find common elements in both arrays
        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection of arrays: " + intersection);
    }
}