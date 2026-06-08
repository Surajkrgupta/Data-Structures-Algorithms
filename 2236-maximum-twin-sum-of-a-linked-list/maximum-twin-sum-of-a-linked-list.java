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
        ListNode f=head,s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        f=head;
        ListNode p=null;
        while(f!=s){
            ListNode n=f.next;
            f.next=p;
            p=f;
            f=n;
        }
        head=p;
        int m=Integer.MIN_VALUE;
        while(s!=null){
            int sum=head.val+s.val;
            m=Math.max(sum,m);
            head=head.next;
            s=s.next;
        }
        return m;
    }
}