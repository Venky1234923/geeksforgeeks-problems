class Solution {
    public String amendSentence(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                if(i != 0) {
                    result.append(" ");
                }

                result.append(Character.toLowerCase(c));
            }
            else {
                result.append(c);
            }
        }

        return result.toString();
    }
}