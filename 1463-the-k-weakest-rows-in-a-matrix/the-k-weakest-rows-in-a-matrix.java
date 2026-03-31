class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[] = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    arr[i]++;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int current = 0;
        while(res.size()<k){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==current){
                    res.add(i);
                    if(res.size()==k){
                        break;
                    }
                }
            }
            current++;
        }
        int ans []= new int[k];
        for(int i=0;i<k;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}