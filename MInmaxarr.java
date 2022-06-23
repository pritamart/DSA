// titel: min max number find in array method one
// author: Pritam Samui
// date: 20-06-2022

import java.util.Scanner;

public class MInmaxarr {
    static class Pair{
        int min,max;
    }
    static Pair getMinMax(int arr[], int length){
        Pair minmax = new Pair();
        int i;
        if(length == 1){ // if array has only one element
            minmax.min = arr[0];
            minmax.max = arr[0];
        }

        else if(arr[0] < arr[1]){ // if array has more thane one elements
            minmax.min = arr[0];
            minmax.max = arr[1];
        } else{
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        
         for(i = 2; i < length; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            } else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
         }
         return minmax;
    }
    public static void main (String arrgs[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numbers of array emlements:");
            int length = sc.nextInt();
            int arr[] = new int[length];

            System.out.print("Enter the array emlements:"); //array input form user
            for(int i = 0; i < length; i++){
                arr[i] = sc.nextInt();
            }

            Pair minmax = getMinMax(arr, length); //getMinmax method calling
            System.out.println("min number is "+minmax.min);
            System.out.println("max number is "+minmax.max);
        
    }
    
}
