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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int max = 0;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nextNode, prevNode = null;
        while(slow!=null){
            nextNode = slow.next;
            slow.next = prevNode;
            prevNode = slow;
            slow = nextNode;
        }
        ListNode temp = head;
        while(prevNode!=null){
            max = Math.max(max, temp.val+prevNode.val);
            temp = temp.next;
            prevNode = prevNode.next;
        }
        return max;
    }
}