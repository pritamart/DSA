// titel: Reverse an array
// author: Pritam Samui
// date: 21-06-2022

public class ReverseArray {
    static void rverseArray(int arr[], int start, int end){
        int temp;
        while(start < end){  //Reverse function Iterative way
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    static void Reversearray(int arr[], int start, int end){ //Reverse function Recursive way
            if(start >= end)
                return;
                int temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                Reversearray(arr, start+1, end-1);
    }


    static void printArray(int arr[],int size){ // print the array
        for(int i = 0; i < size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6};
        int size = 6;
        printArray(arr, size);
        rverseArray(arr, 0, 5);
        System.out.println("Reverse an array (iterative) :");
        printArray(arr, size);
        Reversearray(arr, 0, 5);
        System.out.println("Reverse an array (Recursive) :");
        printArray(arr, size);
    }

}
