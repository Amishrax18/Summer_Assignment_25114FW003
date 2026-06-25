import java.util.Arrays;

public class sortNames {
    public static void main(String[] args) {
        String[] names = {"Arjun", "Rahul", "Aman", "Priya", "Neha"};

        // Sort names alphabetically
        Arrays.sort(names);

        // Display sorted names
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}