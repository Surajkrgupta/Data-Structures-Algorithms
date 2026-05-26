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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode t=head;
        int c=0;
        while(c<k){
            if(t==null) return head;
            t=t.next;
            c++;
        }
        ListNode nn=reverseKGroup(t,k);
        t=head;c=0;
        while(c<k){
            ListNode n=t.next;
            t.next=nn;
            nn=t;
            t=n;
            c++;
        }
        return nn;



    }
}