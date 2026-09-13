class Solution {
    public String reducedString(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));

            int n = result.length();

            if(n >= 3 &&
               result.charAt(n - 1) == result.charAt(n - 2) &&
               result.charAt(n - 2) == result.charAt(n - 3)) {

                result.delete(n - 3, n);
            }
        }

        if(result.length() == 0) {
            return "-1";
        }

        return result.toString();
    }
}