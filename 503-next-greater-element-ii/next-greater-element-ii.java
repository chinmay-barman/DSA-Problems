class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<2*nums.length-1;i++){
            while(!st.isEmpty() && nums[i%nums.length]>nums[st.peek()]){
                ans[st.pop()] = nums[i%nums.length];
            }
            if(i<nums.length){
                st.push(i%nums.length);
            }
        }
        while(st.size()>0){
            ans[st.pop()] = -1;
        }
        return ans;
    }
}