class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,0);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int count=map.get(1);
                count++;
                map.put(1,count);
                max=Math.max(max,count);
            }
            else{
                map.put(1,0);
            }
        }
        return max;
    }
}