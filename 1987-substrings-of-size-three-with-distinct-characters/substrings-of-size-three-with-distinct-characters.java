class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int left=0, right=0;
        while(right<s.length()){
            if(right-left+1==3){
                if(s.charAt(left)!=s.charAt(left+1) && s.charAt(right)!=s.charAt(right-1) && s.charAt(left)!=s.charAt(right)){
                    count++;
                }
                left++;
            }
            right++;
        }
        return count;
    }
}