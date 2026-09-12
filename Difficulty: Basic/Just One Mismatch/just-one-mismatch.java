class Solution {
    public boolean isStringExist(String s, String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() == s.length()) {
                int count = 0;

                for(int j = 0; j < s.length(); j++) {
                    if(s.charAt(j) != arr[i].charAt(j)) {
                        count++;
                    }
                }

                if(count == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}