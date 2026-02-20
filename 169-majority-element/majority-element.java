class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}