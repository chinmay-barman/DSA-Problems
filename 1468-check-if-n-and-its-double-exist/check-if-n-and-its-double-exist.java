class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int index = Arrays.binarySearch(arr, 2*arr[i]);
            if(index>=0 && index!=i){
                return true;
            }
        }
        return false;
    }
}