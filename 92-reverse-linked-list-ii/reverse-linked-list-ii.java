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

    
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d=new ListNode(-1,head);
        if(head==null || head.next==null || left==right) return head;
        ListNode pre=d;
        for(int i=1;i<left;i++){
            pre=pre.next;
        }
        ListNode curr=pre.next;

        for(int i=1;i<=right-left;i++){
            ListNode t=pre.next;
            pre.next=curr.next;
            curr.next=curr.next.next;
            pre.next.next=t;


        }
        return d.next;

        
    }
}