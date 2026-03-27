class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            res.add((candies[i]+extraCandies)>=max);
        }
        return res;
    }
}