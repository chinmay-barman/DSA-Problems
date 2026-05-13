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
    public int getGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;
        while(right!=null){
            int gcd = getGCD(left.val, right.val);
            ListNode newNode = new ListNode(gcd);
            left.next = newNode;
            newNode.next = right;
            left = right;
            right = right.next;
        }
        return head;
    }
}