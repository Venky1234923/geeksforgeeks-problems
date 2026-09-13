class Solution {
    int calcDiff(String s) {
        int score = 0;
        String[] words = s.split(" ");
        for(String word : words) {
            int vowels = 0;
            int consonants = 0;
            int count = 0;
            for(int i = 0; i < word.length(); i++) {
                char c = Character.toLowerCase(word.charAt(i));
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                    count = 0;
                }
                else {
                    consonants++;
                    count++;

                    if(count == 4) {
                        break;
                    }
                }
            }
            if(count >= 4 || consonants > vowels) {
                score = score + 5;
            }
            else {
                score = score + 3;
            }
        }
        return score;
    }
}