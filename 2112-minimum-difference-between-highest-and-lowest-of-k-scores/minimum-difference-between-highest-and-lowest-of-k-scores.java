class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int minimum=Integer.MAX_VALUE;
        while(i<=nums.length-k){
            int currentDiff=nums[i+k-1]-nums[i];;
            minimum=Math.min(currentDiff, minimum);
            i++;
        }
        return minimum;
    }
}