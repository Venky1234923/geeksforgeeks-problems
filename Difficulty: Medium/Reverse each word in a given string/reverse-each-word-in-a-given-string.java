class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        String result = "";

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverse = "";

            for(int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }

            if(i > 0) {
                result = result + " ";
            }

            result = result + reverse;
        }

        return result;
    }
}