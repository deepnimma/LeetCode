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
        if (head == null) return head;

        ListNode dummy = new ListNode(-1, head);

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (curr != null) {
            if (curr.next == null) {
                curr.next = prev;
                break;
            } // if

            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        } // while

        return curr;
    } // reverseList
} // Solution