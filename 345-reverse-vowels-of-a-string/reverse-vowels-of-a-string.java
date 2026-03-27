class Solution {
    public String reverseVowels(String s) {
        HashSet<Character>set = new HashSet<>();
        StringBuilder sb = new StringBuilder(s);
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(!set.contains(Character.toLowerCase(sb.charAt(left)))){
                left++;
            }
            if(!set.contains(Character.toLowerCase(sb.charAt(right)))){
                right--;
            }
            if(set.contains(Character.toLowerCase(sb.charAt(left))) && set.contains(Character.toLowerCase(sb.charAt(right)))){
                char temp = sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,temp);
                left++;
                right--;
            }

        }
        return sb.toString();
    }
}