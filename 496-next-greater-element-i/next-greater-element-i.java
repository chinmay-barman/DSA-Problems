class Solution {
    int[] largestNums2(int nums2[]){
        int n = nums2.length;
        int res[] = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                res[st.peek()] = nums2[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.peek()] = -1;
            st.pop();
        }
        return res;
    }
    int findIndex(int nums2[], int target){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==target){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res2[] = largestNums2(nums2);
        int res[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index = findIndex(nums2, nums1[i]);
            if(index!=-1){
                res[i] = res2[index];
            }
            else{
                res[i] = -1;
            }
        }
        return res;
    }
}