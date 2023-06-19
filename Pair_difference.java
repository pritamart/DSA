import java.util.*;

public class Pair_difference {
    public static boolean difference(int a[],int n){
        Arrays.sort(a);
        int l=0,r=1;
        n = Math.abs(n);
        while(l <= r && r < a.length){
            int diff=a[r]-a[l];
            if(diff == n && l != r){
                System.out.println(a[l]+" "+a[r]);
                return true;
            }else if(diff > n){
                l++;
            } else{
                r++;
            }
        }
        System.out.println("not found");
        return false;

    }
    public static void main(String[] args) {
        int a [] = {5, 20, 3, 2, 50, 80};
        int n = 78;
        difference(a,n); 
    }
    
}
