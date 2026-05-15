class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
            if(!set.contains(num -1)){

                int currentNum = num;
                int currentStark = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentStark++;
                }

                longest = Math.max(longest, currentStark);
            }
        }
        return longest;
    }
}
