import java.util.*;

class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if(map.containsKey(need)) {
                count = count + map.get(need);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}