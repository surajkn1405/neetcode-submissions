class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> list = new HashSet<>();

        while(i < len1 && j < len2){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }

        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}