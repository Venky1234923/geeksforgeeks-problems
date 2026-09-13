class Solution {
    public String toggleCase(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c >= 'a' && c <= 'z') {
                result.append(Character.toUpperCase(c));
            }
            else if(c >= 'A' && c <= 'Z') {
                result.append(Character.toLowerCase(c));
            }
            else {
                result.append(c);
            }
        }

        return result.toString();
    }
}