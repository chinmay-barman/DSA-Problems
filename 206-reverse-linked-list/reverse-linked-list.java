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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int size=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(temp!=null){
            map.put(size, temp.val);
            size++;
            temp=temp.next;
        }
        for(int i=0;i<size/2;i++){
            int t=map.get(i);
            map.put(i,map.get(size-1-i));
            map.put(size-1-i, t);
        }
        temp=head;
        int count=0;
        while(count<size){
            temp.val = map.get(count);
            count++;
            temp=temp.next;
        }
        return head;
    }
}