class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count =map.get(s.charAt(i));
                count++;
                map.put(s.charAt(i), count);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int count=map.get(t.charAt(i));
                count--;
                map.put(t.charAt(i),count);
            }
            else{
                return t.charAt(i);
            }
        }
        char ans='0';
        Set<Character> keys = map.keySet();
        for(char i: keys){
            if(map.get(i)>0 || map.get(i)<0) ans=i;
        }
        return ans;
    }
}