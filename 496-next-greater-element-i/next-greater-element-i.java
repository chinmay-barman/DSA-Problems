class Solution {
    int findLargest(int nums2[], int index){
        if(index == -1){
            return -1;
        }
        int largest = -1;
        for(int i=index+1;i<nums2.length;i++){
            if(nums2[i]>nums2[index]){
                largest = nums2[i];
                break;
            }
        }
        return largest;
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
        int res[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index = findIndex(nums2,nums1[i]);
            int largest = findLargest(nums2, index);
            res[i] = largest;
        }
        return res;
    }
}