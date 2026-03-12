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
    int size(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int getDecimalValue(ListNode head) {
        int n = size(head)-1;
        int decimal = 0;
        ListNode temp = head;
        while(temp!=null){
            decimal+=(temp.val*(int)Math.pow(2,n));
            temp = temp.next;
            n--;
        }
        return decimal;
    }
}