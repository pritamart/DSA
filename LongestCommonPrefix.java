public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0]; // Initialize prefix with the first string
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix length
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, there is no common prefix
                }
            }
        }
        
        return prefix;
    }
    
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String prefix1 = longestCommonPrefix(strs1);
        System.out.println("Longest common prefix: " + prefix1);
        
        String[] strs2 = {"dog", "racecar", "car"};
        String prefix2 = longestCommonPrefix(strs2);
        System.out.println("Longest common prefix: " + prefix2);
    }
}
