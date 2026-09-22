import java.util.*;

class Solution {
    public int dominantPairs(int[] arr) {

        int n = arr.length;
        int half = n / 2;
        int count = 0;

        int[] first = Arrays.copyOfRange(arr, 0, half);
        int[] second = Arrays.copyOfRange(arr, half, n);

        Arrays.sort(first);
        Arrays.sort(second);

        int j = 0;

        for(int i = 0; i < half; i++) {

            while(j < half && first[i] >= 5 * second[j]) {
                j++;
            }

            count = count + j;
        }

        return count;
    }
}