class Solution {
    public static String missingPanagram(String s) {
        boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if(c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        String result = "";

        for(int i = 0; i < 26; i++) {
            if(!seen[i]) {
                result = result + (char)('a' + i);
            }
        }

        if(result.length() == 0) {
            return "-1";
        }

        return result;
    }
}