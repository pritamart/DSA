// titel: max sum subarray
// author: Pritam Samui
// date: 22-06-2022
public class Kadane {
	static int maxSubArraySum(int a[]) {
		int maxsum = 0;
		int currentsum = 0;
		for (int i = 0; i < a.length; i++) {
			currentsum = currentsum + a[i];
			if (currentsum > maxsum) {
				maxsum = currentsum;
			}
			if (currentsum < 0) {
				currentsum = 0;
			}
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " +
				maxSubArraySum(a));
	}

}