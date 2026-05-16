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
    ListNode fmid(ListNode h){
        ListNode p=null;
        ListNode f=h;
        ListNode s=h;
        while(f!=null && f.next!=null){
            p=s;
            s=s.next;
            f=f.next.next;
        }
        return p;
    }

    ListNode ml(ListNode l1,ListNode l2){
        ListNode d=new ListNode(-1);
        ListNode t=d;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                t.next=l1;
                t=t.next;
                l1=l1.next;
            }else{
                t.next=l2;
                t=t.next;
                l2=l2.next;
            }
        }
        if(l1==null) t.next=l2;
        if(l2==null) t.next=l1;
        return d.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode left=head;
        ListNode mid=fmid(head);
        ListNode right=mid.next;
        mid.next=null;

        left=sortList(left);
        right=sortList(right);

        return ml(left,right);
    }
}