class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int left =0, right=0;
        int sum=0;
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1==k){
                if((double)sum/(double)k>=threshold){
                    count++;
                }
                sum-=arr[left];
                left++;
            }
            right++;
        }
        return count;
    }
}