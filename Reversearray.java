import java.util.Arrays;

public class Reversearray {
    static void Reverse(int arr[]){
        int start = 0, end = arr.length-1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end --;
        }
        System.out.println("Reverse array "+Arrays.toString(arr));

    }
    public static void main(String[] args)
	{
		int a[] = { -2, -3, 4, -1, -2, 1, 50, -3 };
		Reverse(a);
	}
    
}
