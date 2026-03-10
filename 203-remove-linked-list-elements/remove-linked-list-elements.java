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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(fast.next!=null){
            if(fast.next.val!=val){
                slow.next = fast.next;
                slow = slow.next;
                fast = fast.next;
            }
            else{
                fast = fast.next;
            }
        }
        slow.next = null;
        return dummy.next;
    }
}