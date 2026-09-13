import java.util.*;
class Solution {
    public static boolean checkPangram(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        return set.size() == 26;
    }
}
