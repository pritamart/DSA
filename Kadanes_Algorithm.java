// public class Kadanes_Algorithm {
// Java program to print largest
// contiguous array sum
import java.io.*;
import java.util.*;
class Kadanes_Algorithm {

	static void maxSubArraySum(int a[], int n)
	{
        int sum = a[0];
        int max = a[0];
        for(int i = 0 ; i < n; i++){
               sum += a[i];
           
            if(max < sum){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
	}

	// Driver code
	public static void main(String[] args)
	{
		int a[] = { -2, -3, 4, -1, -2, 1, 50, -3 };
		int n = a.length;
		maxSubArraySum(a, n);
	}
}

// This code is contributed by prerna saini

