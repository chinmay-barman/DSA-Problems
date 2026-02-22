class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                ans[0]=map.get(complement)+1;
                ans[1]=i+1;
                break;
            }
            map.put(numbers[i],i);
        }
        return ans;
    }
}