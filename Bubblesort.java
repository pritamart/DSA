public class Bubblesort {
    public static void bubblesort(int a[]){
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a.length -1-i;j++){
                if(a[j] >= a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int k = 0 ; k <a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {20,3,12,4,100,2};
        bubblesort(a);
    }
}
