class Solution {
    public char decodeIt(String s, long k) {
        long len = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c >= 'a' && c <= 'z') {
                len++;
            }
            else {
                len = len * (c - '0');
            }
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if(c >= '1' && c <= '9') {
                len = len / (c - '0');
                k = k % len;

                if(k == 0) {
                    k = len;
                }
            }
            else {
                if(k == len) {
                    return c;
                }

                len--;
            }
        }

        return ' ';
    }
}