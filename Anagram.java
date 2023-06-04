import java.util.Arrays;

public class Anagram {
    public static boolean ValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return a.equals(b);
    }

    public static void main(String[] args) {
        String s = "oj cat";
        String t = "tac oj";
        if (ValidAnagram(s, t)) {
            System.out.println("ValidAnagram");
        } else {
            System.out.println("Not ValidAnagram");
        }
    }

}
