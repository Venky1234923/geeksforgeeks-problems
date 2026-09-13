class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = m; i <= n; i++) {
            int num = i;
            int reverse = 0;

            while(num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if(i == reverse) {
                result.add(i);
            }
        }

        return result;
    }
}