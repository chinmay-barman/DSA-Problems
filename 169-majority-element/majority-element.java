class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int majority = -1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count++;
                if(count>nums.length/2){
                    majority = nums[i];
                    break;
                }
                map.put(nums[i],count);
            }
            else{
                map.put(nums[i],1);
                if(1>nums.length/2){
                    majority = nums[i];
                    break;
                }
            }
        }
        return majority;
    }
}