class Solution {
    public boolean vowelCheck(String s, int right){
        if(s.charAt(right)=='a'|| s.charAt(right)=='e' || s.charAt(right)=='i' || s.charAt(right)=='o'||s.charAt(right)=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int maxCount=0;
        int count=0;
        int left=0, right=0;
        while(right<s.length()){
            if(vowelCheck(s, right)==true){
                count++;
            }
            if(right-left+1==k){
                if(count>maxCount) maxCount=count;
                if(vowelCheck(s, left)==true) count--;
                left++;
            }
            right++;
        }
        return maxCount;
    }
}