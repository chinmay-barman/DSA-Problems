class Solution {
    public String firstPalindrome(String[] words) {
        String result ="";
        for(int i=0;i<words.length;i++){
            int left=0, right=words[i].length()-1;
            boolean check=true;
            while(left<right){
                if(words[i].charAt(left)!=words[i].charAt(right)){
                    check = false;
                }
                left++;
                right--;
            }
            if(check){
                result = words[i];
                break;
            }
        }
        return result;
    }
}