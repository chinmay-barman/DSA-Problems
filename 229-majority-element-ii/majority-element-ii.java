class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int value=map.get(nums[i]);
                value+=1;
                map.put(nums[i], value);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        Set<Integer>keys=map.keySet();
        for(int i: keys){
            if(map.get(i)>(int)(nums.length)/3){
                list.add(i);
            }
        }
        return list;
    }
}