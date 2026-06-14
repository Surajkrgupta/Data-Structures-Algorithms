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
        int res = Integer.MIN_VALUE;

        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        ListNode p = null;
        ListNode c = s;
        while (c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c=n;
        }
        ListNode h1 = head;
        ListNode h2 = p;
        while (h2 != null) {
            int sum = h1.val + h2.val;
            res = Math.max(res, sum);
            h1 = h1.next;
            h2 = h2.next;
        }
        return res;

    }
}