class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i < nums.length-2; i++){
            int a = nums[i];
            if(i > 0 &&  a == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int threeSum = a + nums[left] + nums[right];
                if(threeSum > 0){
                    right--;
                }else if(threeSum < 0){
                    left++;
                }else{
                    list.add(List.of(a, nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
