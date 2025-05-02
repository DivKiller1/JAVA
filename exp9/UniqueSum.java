import java.util.*;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));

        HashSet<Integer> unique = new HashSet<>(list);

        int sum = 0;
        for (int num : unique) {
            sum += num;
        }

        System.out.println("Unique values: " + unique);
        System.out.println("Sum of unique values: " + sum);
    }
}
