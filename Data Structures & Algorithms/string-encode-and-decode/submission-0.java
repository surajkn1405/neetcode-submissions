class Solution {

    // Encode
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String word : strs) {

            for (char ch : word.toCharArray()) {
                sb.append((int) ch).append(",");
            }

            sb.append("#");
        }

        return sb.toString();
    }

    // Decode
    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        String[] words = str.split("#", -1);

        for (int i = 0; i < words.length - 1; i++) {

            String word = words[i];

            // Empty string case
            if (word.length() == 0) {
                result.add("");
                continue;
            }

            String[] asciiValues = word.split(",");

            StringBuilder decodedWord = new StringBuilder();

            for (String val : asciiValues) {

                if (val.length() == 0) {
                    continue;
                }

                int ascii = Integer.parseInt(val);

                decodedWord.append((char) ascii);
            }

            result.add(decodedWord.toString());
        }

        return result;
    }
}
