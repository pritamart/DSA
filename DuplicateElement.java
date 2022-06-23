public class DuplicateElement {
    static void duplicateElement(int a[]){
        int temp = 0;
        for(int i = 0; i < a.length;i++){
            for(int j = i+1; j < a.length;j++){
                if(a[i] == a[j]){
                    temp = 1;

                }
            }
        }
        if(temp == 1){
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
    public static void main(String[] args) {
        int a[] = {1,2,4,3};
        duplicateElement(a);
    }
}
