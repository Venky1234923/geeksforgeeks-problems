class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < arr.length - 2; i++) {

            for(int j = i + 1; j < arr.length - 1; j++) {

                for(int k = j + 1; k < arr.length; k++) {

                    if(arr[i] + arr[j] + arr[k] == 0) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(i);
                        temp.add(j);
                        temp.add(k);

                        ans.add(temp);
                    }
                }
            }
        }

        return ans;
    }
}