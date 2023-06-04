import java.util.Arrays;

public class Chocolate_distribution_problem {
    public static void Mindifference(int arr[], int m) {
        Arrays.sort(arr);
        long maxDifrence = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - m; i++) {
            maxDifrence = Math.min(arr[i + m - 1] - arr[i], maxDifrence);
        }
        System.out.println(maxDifrence);
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m = 5;
        Mindifference(a, m);
    }
}
