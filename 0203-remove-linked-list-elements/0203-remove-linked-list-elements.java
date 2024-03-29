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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode currPos = head;

        while (currPos != null && currPos.next != null) {
            if (currPos.next.val == val) {
                currPos.next = currPos.next.next;
            } else {
                currPos = currPos.next;
            }
        }

        return head;
    }
}