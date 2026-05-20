class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        int maxValue = 0;
        int maxElement = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxValue < entry.getValue()){
                maxValue = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }
}