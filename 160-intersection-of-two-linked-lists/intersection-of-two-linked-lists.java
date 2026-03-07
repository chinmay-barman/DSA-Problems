/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int size(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;

        int sizeA = size(t1);
        int sizeB = size(t2);
        if(sizeA>=sizeB){
            for(int i=0;i<sizeA-sizeB;i++){
                t1 = t1.next;
            }
        }
        else{
            for(int i=0;i<sizeB-sizeA;i++){
                t2 = t2.next;
            }
        }
        while(t1 != null && t2 != null){
            if(t1==t2){
                return t1;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return null;
    }
}