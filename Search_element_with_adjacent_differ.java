public class Search_element_with_adjacent_differ {
    public static int search(int a[],int n,int x, int k){
        int i = 0;
        while(i < n){
            if(a[i] == x)
                return i;
            i = i+ Math.max(1, Math.abs(a[i]-x)/k);
            
        }
        System.out.println("Number not found");
        return -1;
    }
     public static void main(String[] args)
    {
         
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;
         
        System.out.println("Element " + x +
                        " is present at index "
                        + search(arr, n, x, k));
    }
    
}
