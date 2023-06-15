public class Selectionsort {
    public static void selection(int a[]){
        for(int i = 0; i <a.length-1;i++){
            int p =i;
            for(int j =i+1;j < a.length;j++){
                if(a[j] <= a[p]){
                    p = j; // set min number index postion
                }
            }
            int min = a[p]; //swap min number to ith positon
            a[p] = a[i];
            a[i] = min;
        }
        for(int i =0;i < a.length;i++){
            System.out.print(a[i]+" ");//print the array
        }
    }
    public static void main(String[] args) {
        int a[] = {20,3,12,4,100,2};
        selection(a);
    }
    
}
