import java.util.*;

public class Frequency_of_string {
    public static void printfrequency(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            count++;
            if (c[i] != c[i + 1]) {
                System.out.println(c[i] + "," + count);
                count = 0;
            }
        }
        // Print the last character frequency
        System.out.println(c[c.length - 1] + "," + (count + 1));
    }

    public static void main(String[] args) {
        String c = "lblfgfgfgf";
        printfrequency(c);
    }
}