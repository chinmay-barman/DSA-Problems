class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=Integer.toString(num);
        int i=0;
        while(i<=s.length()-k){
            String subS=s.substring(i, i+k);
            int subNum=Integer.parseInt(subS);
            if(subNum!=0 && num%subNum==0){
                count++;
            }
            i++;
        }
        return count;
    }
}   