public class Remove_Consecutive_Characters {
    public static String removeConsecutiveCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aabb";
        String result = removeConsecutiveCharacters(s);
        System.out.println(result);
    }
}
