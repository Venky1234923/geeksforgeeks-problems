class Solution {
    public int modified(String s) {
        int result = 0;
        int count = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                result = result + (count - 1) / 2;
                count = 1;
            }
        }

        result = result + (count - 1) / 2;

        return result;
    }
}