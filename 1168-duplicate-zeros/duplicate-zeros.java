class Solution {
    public void rightShift(int arr[], int leftBoundary){
        int right=arr.length-1;
        while(right>leftBoundary){
            arr[right]=arr[right-1];
            right--;
        }
    }
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                rightShift(arr, i+1);
                arr[i+1]=0;
                i++;
            }
        }
    }
}