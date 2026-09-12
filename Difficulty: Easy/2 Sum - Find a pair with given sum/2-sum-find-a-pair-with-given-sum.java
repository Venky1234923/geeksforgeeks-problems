class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        List<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if(set.contains(need)) {
                result.add(need);
                result.add(arr[i]);
                return result;
            }

            set.add(arr[i]);
        }

        return result;
    }
}