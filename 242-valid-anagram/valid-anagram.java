class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                count++;
                map.put(s.charAt(i),count);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int count = map.get(t.charAt(i));
                count--;
                if(count == -1){
                    return false;
                }
                map.put(t.charAt(i),count);
            }
            else{
                return false;
            }
        }
        return true;
    }
}