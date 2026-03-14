class Solution {
    private int countNum(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count; 
    }
    public long findTheArrayConcVal(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int first = 0;
        int last = nums.length-1;
        long concat = 0;
        while(first<=last){
            if(first==last){
                concat+=nums[first];
                break;
            }
            int size = countNum(nums[last]);
            long num = (long)(nums[first]*Math.pow(10,size) + nums[last]);
            concat+=num;
            first++;
            last--;
        }
        return concat;
    }
}