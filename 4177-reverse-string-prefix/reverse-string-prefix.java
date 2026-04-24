class Solution {
    public String reversePrefix(String s, int k) {
        String reversed = new StringBuilder(s.substring(0,k)).reverse().toString();
        String ans = reversed + s.substring(k);
        return ans;
    }
}