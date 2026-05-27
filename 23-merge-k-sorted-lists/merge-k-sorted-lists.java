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
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                t.next=l1;
                l1=l1.next;
            }else{
                t.next=l2;
                l2=l2.next;

            }
            t=t.next;
        }
        if(l1==null)t.next=l2;
        else t.next=l1;
        return d.next;

    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0 || lists==null) return null;
        if(n==1) return lists[0];
        ListNode head=null;
        for(int i=0;i<n;i++){
            head=merge(head,lists[i]);
        }
        return head;
        
    }
}