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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode d=new ListNode();
        ListNode p=d;
        ListNode c=head;
        while(c!=null && c.next!=null){
            p.next=c.next;
            c.next=c.next.next;
            p.next.next=c;
            p=c;
            c=c.next;
        }
        return d.next;
    }
}