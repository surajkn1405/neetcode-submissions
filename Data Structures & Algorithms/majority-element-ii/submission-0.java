class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/3){
                resultList.add(entry.getKey());
            }
        }

        return resultList;
    }
}