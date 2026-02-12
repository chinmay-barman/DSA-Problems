class Solution {
    public int findDuplicate(int[] nums) {
        int repeated=-1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                repeated=nums[i];
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        return repeated;
    }
}