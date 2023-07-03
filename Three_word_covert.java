import java.util.*;

public class Three_word_covert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        a = a.replaceAll("[aeiouAEIOU]","%");
        b = b.replaceAll("[^aeiouAEIOU]","#");
        c = c.toUpperCase();
        System.out.println(a+b+c);

    }

}
