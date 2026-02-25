class Solution {
    public int majorityElement(int[] nums) {
        int frequency=1;
        int majority=nums[0];
        for(int i=0;i<nums.length;i++){
            if(majority==nums[i]){
                frequency++;
            }else{
                frequency--;
                if(frequency==0){
                    majority=nums[i];
                    frequency++;
                }
            }
        }
        return majority;
    }
}