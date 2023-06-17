public class Insertion_sort {
    public static void insertion(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] >= key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;



        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 20, 3, 12, 4, 100, 2 };
        insertion(a);
    }
}
