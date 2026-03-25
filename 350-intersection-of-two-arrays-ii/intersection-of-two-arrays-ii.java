class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int count = map.get(nums1[i]);
                count++;
                map.put(nums1[i],count);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                int count = map.get(nums2[i]);
                if(count!=0){
                    count --;
                    map.put(nums2[i],count);
                    res.add(nums2[i]);
                }
            }
        }
        int ans[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}