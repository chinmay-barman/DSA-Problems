class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() || s.charAt(i)!=st.peek()){
                st.push(s.charAt(i));
            }
            else if(st.peek() == s.charAt(i)){
                st.pop();
            }
            
        }
        int n = st.size();
        for(int i=0;i<n;i++){
            ans = String.valueOf(st.pop()) + ans;
        }
        return ans;
    }
}