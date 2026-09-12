class Solution {
    public String snakeCase(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "_");

        return s;
    }
}