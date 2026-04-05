class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(fast<nums.length && slow<nums.length){
            if(nums[fast] != 0 && nums[slow] == 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
            else if(nums[slow]!=0){
                slow++;
            }
            fast++;
        }
    }
}