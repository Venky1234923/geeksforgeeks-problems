class Solution {
    public boolean isCircular(String s) {
        int x = 0;
        int y = 0;
        int direction = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'G') {
                if(direction == 0) {
                    y++;
                }
                else if(direction == 1) {
                    x++;
                }
                else if(direction == 2) {
                    y--;
                }
                else {
                    x--;
                }
            }
            else if(c == 'L') {
                direction = (direction + 3) % 4;
            }
            else {
                direction = (direction + 1) % 4;
            }
        }

        return x == 0 && y == 0;
    }
}