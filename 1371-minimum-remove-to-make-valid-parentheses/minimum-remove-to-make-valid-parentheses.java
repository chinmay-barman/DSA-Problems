class Solution {
    public String minRemoveToMakeValid(String s) {
        String ans = "";
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    st.push(i);
                }
                else if(s.charAt(st.peek())==')'){
                    st.push(i);
                }
                else{
                    st.pop();
                }
            }
        }
        HashSet<Integer>set = new HashSet<>();
        while(!st.isEmpty()){
            set.add(st.pop());
        }
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                ans+=Character.toString(s.charAt(i));
            }
        }
        return ans;
    }
}