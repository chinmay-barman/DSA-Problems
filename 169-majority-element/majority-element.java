class Solution {
    public int majorityElement(int[] nums) {
        int frequency=0;
        int majority=-1;
        for(int i=0;i<nums.length;i++){
            if(frequency==0){
                majority=nums[i];
            }
            if(nums[i]==majority){
                frequency++;
            }
            else{
                frequency--;
            }
        }
        return majority;
    }
}