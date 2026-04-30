class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        if(nums.length==1){
            res.add(nums[0]);
            return res;
        }
        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        l[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            l[i] = Math.max(l[i-1],nums[i]);
        }
        r[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            r[i] = Math.max(nums[i],r[i+1]);
        }
        res.add(nums[0]);
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>l[i-1] || nums[i]>r[i+1]){
                res.add(nums[i]);
            }
        }
        res.add(nums[nums.length-1]);
        return res;
    }
}