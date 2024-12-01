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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode front = dummy;
        ListNode curr = dummy;

        for (int i = 0; i < n + 1; i++) front = front.next;

        while (front != null) {
            front = front.next;
            curr = curr.next;
        } // while

        curr.next = curr.next.next;

        return dummy.next;
    } // removeNthFromEnd
} // Solution