class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();

        int half = n / 2;

        int[] a = new int[26];
        int[] b = new int[26];

        for(int i = 0; i < half; i++) {
            a[s.charAt(i) - 'a']++;
        }

        for(int i = n - half; i < n; i++) {
            b[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}