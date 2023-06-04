public class Search_in_a_rotated_sorted_array {
    public static int ModifyBsearch(int a[], int m) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == m) {
                return mid;
            }
            if (a[start] <= a[mid]) {
                if (a[start] <= m && m <= a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if(a[mid] <= m && m <= a[end]){
                    start = mid+1;

                } else{
                    end = mid -1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2};
        int m = 0;
        int h = ModifyBsearch(a, m);
        System.out.println(h);
    }
}
