class Solution {
    public int reverse(int n){
        int ans = 0;
        while(n!=0){
            int last = n%10;
            ans = ans*10+last;
            n/=10;
        }
        return ans;
    }
    public int mirrorDistance(int n) {
        int reversed = reverse(n);
        return Math.abs(n-reversed);
    }
}