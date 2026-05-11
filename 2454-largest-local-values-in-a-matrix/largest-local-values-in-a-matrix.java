class Solution {
    public int maxValue(int[][]grid, int r, int c){
        int max = -1;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int ans[][] = new int[grid.length-2][grid[0].length-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j] = maxValue(grid, i, j);
            }
        }
        return ans;
    }
}