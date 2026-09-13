class Solution {
    public String printString(String s, char ch, int count) {
        int found = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch) {
                found++;

                if(found == count) {
                    if(i + 1 < s.length()) {
                        return s.substring(i + 1);
                    }
                    else {
                        return "";
                    }
                }
            }
        }

        return "";
    }
}