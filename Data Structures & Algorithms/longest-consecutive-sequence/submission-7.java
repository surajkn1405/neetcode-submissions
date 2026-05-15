class Solution {
    public int longestConsecutive(int[] nums) {

     // Approach 1//   
        Set<Integer> set = new HashSet<>();

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
  
        //Approach 2

        // if(nums.length == 0){
        //     return 0;
        // }

        // Set<Integer> set = new HashSet<>();

        // for(int num : nums){
        //     set.add(num);
        // }

        // // Convert set to array
        // int[] sortedNums = new int[set.size()];
        // int index = 0;

        // for (int num : set) {
        //     sortedNums[index++] = num;
        // }

        // // Sort array
        // Arrays.sort(sortedNums);
        // int longest = 1;
        // int count = 1;

        // for(int i = 0; i < sortedNums.length-1; i++){

        //     if(sortedNums[i+1] - sortedNums[i] == 1){
        //         count++;
        //     }else{
        //         longest = Math.max(longest , count);
        //         count = 1;
        //     }
        // }

        // longest = Math.max(longest , count);

        // return longest;
    }
}
