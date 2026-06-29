class Solution {
    public boolean isSubsequence(String s, String t) {
        int first = 0;
        int second = 0;
        int count = s.length();

        if(s.length() > t.length()){
            return false;
        }

        while(first < s.length()){
            if(second == t.length()){
                break;
            }
            if(s.charAt(first) == t.charAt(second)){
                count--;
                first++;
                second++;
            }else{
                second++;
            }
        }

        if(count == 0){
            return true;
        }

        return false;
    }
}