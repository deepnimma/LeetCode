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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode currPos = head;

        while (currPos != null && currPos.next != null) {
            if (currPos.val == currPos.next.val) {
                currPos.next = currPos.next.next;
                continue;
            }
            
            currPos = currPos.next;
        }

        return head;
    }
}