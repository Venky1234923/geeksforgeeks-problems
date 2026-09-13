class Solution {
    public String boomNumber(int k) {
        k = k + 1;

        String result = "";

        while(k > 1) {
            if(k % 2 == 0) {
                result = "2" + result;
            }
            else {
                result = "3" + result;
            }

            k = k / 2;
        }

        return result;
    }
}