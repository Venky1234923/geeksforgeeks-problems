import java.util.*;
class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        ArrayList<pair> list = new ArrayList<pair>();
        for(int i = 0; i < arr1.length; i++) {
            int need = target - arr1[i];
            if(map.containsKey(need)) {
                int count = map.get(need);
                for(int j = 0; j < count; j++) {
                    list.add(new pair(arr1[i], need));
                }
            }
        }
        pair[] result = new pair[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}