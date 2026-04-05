class Solution {
    public int countSubarrays(int[] nums) {
        int left = 0;
        int right = 2;
        int count = 0;
        while(right<nums.length){
            int mid = left+(right-left)/2;
            if((double)nums[mid]/(double)2 == (double)(nums[left]+nums[right])){
                count++;
            }
            left++;
            right++;
        }
        return count;
    }
}