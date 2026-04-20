class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int ans[] = new int[2];
        int index =0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                ans[index++] = nums[i];
            }
        }
        return ans;
    }
}