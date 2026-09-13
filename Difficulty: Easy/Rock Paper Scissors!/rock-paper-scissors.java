class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int cycle = a.length() * b.length();

        int full = k / cycle;
        int rem = k % cycle;

        int A = 0;
        int B = 0;

        for(int i = 0; i < cycle; i++) {
            char x = a.charAt(i % a.length());
            char y = b.charAt(i % b.length());

            if(x == y) {
                continue;
            }

            if((x == 'R' && y == 'S') ||
               (x == 'S' && y == 'P') ||
               (x == 'P' && y == 'R')) {
                A++;
            }
            else {
                B++;
            }
        }

        A = A * full;
        B = B * full;

        for(int i = 0; i < rem; i++) {
            char x = a.charAt(i % a.length());
            char y = b.charAt(i % b.length());

            if(x == y) {
                continue;
            }

            if((x == 'R' && y == 'S') ||
               (x == 'S' && y == 'P') ||
               (x == 'P' && y == 'R')) {
                A++;
            }
            else {
                B++;
            }
        }

        return new int[]{A, B};
    }
}