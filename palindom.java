import java.util.Scanner;

public class palindom {
    static int Reverse(int n) {
        int rem, sum = 0;
        int num = n;
       
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
     
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = Reverse(n);
        if (n == check) {
            System.out.println("IT is palindom");
        } else
            System.out.println("It is not palidom");
    }
}
