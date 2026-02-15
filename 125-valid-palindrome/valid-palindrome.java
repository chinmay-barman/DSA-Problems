class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder r = new StringBuilder(); 
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if((ch >= '0' && ch <= '9') ||
               (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z')) {
                r.append(ch);
            }
        }
        String result = r.toString().toLowerCase(); 

        int left=0;
        int right=result.length()-1;
        boolean check=true;
        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                check=false;
                break;
            }
            left++;
            right--;
        }
        return check;
    }
}