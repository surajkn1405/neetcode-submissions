class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroup = new HashMap<>();

        int[] charCount = new int[26];

        for(String s : strs){
            Arrays.fill(charCount, 0);
            for(char c : s.toCharArray()){
                charCount[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int i = 0; i < 26; i++){
                keyBuilder.append(charCount[i]);
                keyBuilder.append(',');
            }

            String key = keyBuilder.toString();
            anagramGroup.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(anagramGroup.values());
    }
}
