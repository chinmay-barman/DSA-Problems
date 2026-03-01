class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        return new int[]{first,last};
    }
}