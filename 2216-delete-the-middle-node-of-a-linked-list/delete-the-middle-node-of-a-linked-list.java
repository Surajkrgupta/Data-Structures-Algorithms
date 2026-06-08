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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode f=head,s=head;
        ListNode p=head;
        while(f!=null && f.next!=null && f.next.next!=null){
            f=f.next.next;
            p=s;
            s=s.next;
        }
        if(f.next==null){
            p.next=p.next.next;
            return head;
        }
        s.next=s.next.next;
        return head;
    }
}