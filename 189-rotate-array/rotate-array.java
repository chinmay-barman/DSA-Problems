class Solution {
    public void rotate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[(i+k)%nums.length]=map.get(i);
        }
    }
}