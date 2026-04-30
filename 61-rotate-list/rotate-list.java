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
    public int size(ListNode head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode left = head;
        ListNode right = left;
        int size = size(head);
        for(int i=0;i<k%size;i++){
            right = right.next;
        }
        while(right.next!=null){
            left = left.next;
            right = right.next;
        }
        right.next = head;
        head = left.next;
        left.next = null;
        return head;
    }
}