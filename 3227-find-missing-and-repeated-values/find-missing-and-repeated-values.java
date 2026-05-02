class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
                sum += grid[i][j];
            }
        }
        ans[1] = (((grid.length*grid.length)*(grid.length*grid.length+1))/2) - (sum - ans[0]);
        return ans;
    }
}