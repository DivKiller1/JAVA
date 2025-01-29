import java.util.Scanner;

public class MinMax {
    public static int[] findMinMax(int[] nums, int n) {
        int max = nums[0], min = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = findMinMax(nums, n);
        System.out.println("Maximum: " + result[0] + ", Minimum: " + result[1]);
    }
}
