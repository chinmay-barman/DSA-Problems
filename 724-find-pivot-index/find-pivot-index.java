class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefixSum[]=new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
        }
        //Strictly Left
        if((prefixSum[n-1]-prefixSum[0])==0){
            return 0;
        }
        //Others Middle's
        for(int i=1;i<nums.length-1;i++){
            if(prefixSum[i-1]==(prefixSum[n-1]-prefixSum[i])){
                return i;
            }
        }
        //Strictly Right
        if(prefixSum[n-2]==0){
            return n-1;
        }
        return -1; //Nohting Found
    }
}