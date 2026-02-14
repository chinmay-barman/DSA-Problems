class Solution {
    public int maxScore(String s) {
        int arr[]=new int[s.length()];
        arr[0]=s.charAt(0)-'0';
        for(int i=1;i<s.length();i++){
            arr[i]=arr[i-1]+(s.charAt(i)-'0');
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            int rightOne =arr[s.length()-1]-arr[i];
            int leftZero=(i+1)-arr[i];
            int score = rightOne+leftZero;
            max = Math.max(max,score);
        }
        return max;
    }
}