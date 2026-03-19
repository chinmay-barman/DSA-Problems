class Solution {
    int[] largestNums2(int nums2[]){
        int n = nums2.length;
        int res[] = new int[n];
        Stack<Integer>st = new Stack<>();
        st.push(nums2[n-1]);
        res[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(nums2[i]);
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