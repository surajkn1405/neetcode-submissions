class Solution {
    public String mergeAlternately(String word1, String word2) {

        int left = 0;
        int right = 0;
        String word = "";

        while(left < word1.length() && right < word2.length()){
            word = word + (word1.charAt(left)) + (word2.charAt(right));
            left++;
            right++;
        }

        word += (word1.substring(left));
        word += (word2.substring(right));

        return word;
    }
}