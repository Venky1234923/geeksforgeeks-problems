class Solution {
    public String removeChars(String s1, String s2) {
        String result = "";

        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if(s2.indexOf(c) == -1) {
                result = result + c;
            }
        }

        return result;
    }
}