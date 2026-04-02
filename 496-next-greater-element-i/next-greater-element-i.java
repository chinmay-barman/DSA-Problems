class Solution {
    private int[] nextGreater(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.pop()] = -1;
        }
        return res;
    }
    private int findIndex(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextGreaterNums2[] = new int[nums2.length];
        nextGreaterNums2 = nextGreater(nums2);

        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index = findIndex(nums2, nums1[i]);
            if(index==-1){
                ans[i] = -1;
            }
            else{
                ans[i] = nextGreaterNums2[index];
            }
        }
        return ans;
    }
}