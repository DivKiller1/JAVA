import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 8, 10, 13, 17));

        for (Integer num : numbers) {
            int n = num; // unboxing
            System.out.println(n + " is " + (isPrime(n) ? "Prime" : "Not Prime"));
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
