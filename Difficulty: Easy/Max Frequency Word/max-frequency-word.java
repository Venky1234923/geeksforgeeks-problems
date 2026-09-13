import java.util.*;

class Solution {
    public String maximumFrequency(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int max = 0;
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }

        for (String word : words) {
            if (map.get(word) == max) {
                return word + " " + max;
            }
        }

        return "";
    }
}
