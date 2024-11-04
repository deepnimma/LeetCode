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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        * 734 437
        * 389 983
        * 1123 1420
        */
        ListNode head = new ListNode();
        ListNode curr = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
            } // if

            if (l2 != null) {
                v2 = l2.val;
            } // if

            int val = v1 + v2 + carry;

            carry = val / 10;
            val %= 10;

            curr.next = new ListNode(val);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        } // while

        if (carry != 0) {
            curr.next = new ListNode(carry);
        } // if

        return head.next;
    } // addTwoNumbers
} // Solution