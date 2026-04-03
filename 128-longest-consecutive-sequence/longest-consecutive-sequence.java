class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == (current+1)){
                current += 1;
                count++;
                max = Math.max(max,count);
            }
            else{
                current = nums[i];
                if(nums[i-1] != current){
                    count = 1;
                }
            }
        }
        return max;
    }
}