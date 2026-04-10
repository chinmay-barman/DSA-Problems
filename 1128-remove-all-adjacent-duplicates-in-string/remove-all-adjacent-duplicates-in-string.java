class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==(st.peek())){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        String ans = "";
        while(st.size()>0){
            ans+=Character.toString(st.pop());
        }
        return ans;
    }
}