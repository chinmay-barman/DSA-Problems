class Solution {
    public int maxScore(String s) {
        HashMap<Integer,Integer>zero=new HashMap<>();
        HashMap<Integer,Integer>one=new HashMap<>();
        int count0=0;
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
                zero.put(i,count0);
                one.put(i,count1);
            }
            else{
                count1++;
                one.put(i,count1);
                zero.put(i,count0);
            }
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            int score = zero.get(i)+(count1-one.get(i));
            max=Math.max(max,score);
        }
        return max;
    }
}