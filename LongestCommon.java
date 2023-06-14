public class LongestCommon {
    public static String longestCommonPrefix(String[] s) {
        String res = s[0];
        for (int i = 1; i < s.length; i++) {
            res = common(res, s[i]);
        }
        return res;
    }

    public static String common(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                sb.append(a.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String[] strs1 = { "flower", "flow", "flight" };
        String prefix1 = longestCommonPrefix(strs1);
        System.out.println("Longest common prefix: " + prefix1);

        String[] strs2 = { "dog", "racecar", "car" };
        String prefix2 = longestCommonPrefix(strs2);
        System.out.println("Longest common prefix: " + prefix2);
    }

}
