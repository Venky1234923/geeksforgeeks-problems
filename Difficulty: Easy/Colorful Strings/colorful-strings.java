class Solution {
    int countStrings(int n, int r, int b, int g) {
        int ans = 0;

        for(int R = r; R <= n; R++) {
            for(int B = b; B <= n - R; B++) {
                int G = n - R - B;

                if(G >= g) {
                    int total = R + B + G;

                    long ways = 1;

                    for(int i = 1; i <= R; i++) {
                        ways = ways * (total - i + 1) / i;
                    }

                    for(int i = 1; i <= B; i++) {
                        ways = ways * (total - R - i + 1) / i;
                    }

                    ans += ways;
                }
            }
        }

        return ans;
    }
}