class Solution {
    boolean isPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();

        return s.equals(reverse);
    }
}
