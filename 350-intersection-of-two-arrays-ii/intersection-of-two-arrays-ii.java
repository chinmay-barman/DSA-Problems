class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>s=new ArrayList<>();
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int count=map.get(nums1[i]);
                count+=1;
                map.put(nums1[i], count);
            }
            else{
                map.put(nums1[i], 1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                s.add(nums2[i]);
                int count=map.get(nums2[i]);
                count--;
                map.put(nums2[i], count);
            }
        }
        int arr[]=new int[s.size()];
        for(int i=0;i<s.size();i++){
            arr[i]=s.get(i);
        }
        return arr;
    }
}