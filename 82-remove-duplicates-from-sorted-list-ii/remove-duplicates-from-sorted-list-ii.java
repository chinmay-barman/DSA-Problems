/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        while(fast!= null){
            if(map.containsKey(fast.val)){
                int count = map.get(fast.val);
                map.put(fast.val,++count);
            }
            else{
                map.put(fast.val,1);
            }
            fast = fast.next;
        }
        fast = head;
        while(fast!=null){
            if(map.get(fast.val)>1){
                fast = fast.next;
            }
            else{
                slow.next = fast;
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = null;
        }
        return dummy.next;
    }
}